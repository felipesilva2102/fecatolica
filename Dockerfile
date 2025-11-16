### Etapa 1: Build com Maven (Java 21)
FROM maven:3.9.9-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

### Etapa 2: Tomcat + Java 21
FROM eclipse-temurin:21-jdk
WORKDIR /opt/tomcat

# Baixa e prepara o Tomcat
ENV TOMCAT_VERSION=10.1.17
RUN apt-get update && apt-get install -y curl && \
    curl -L https://dlcdn.apache.org/tomcat/tomcat-10/v${TOMCAT_VERSION}/bin/apache-tomcat-${TOMCAT_VERSION}.tar.gz -o /tmp/tomcat.tar.gz && \
    tar -xzf /tmp/tomcat.tar.gz -C /opt/tomcat --strip-components=1 && \
    rm /tmp/tomcat.tar.gz && \
    chmod +x /opt/tomcat/bin/catalina.sh

# Copia o WAR compilado (app principal como ROOT.war)
COPY --from=build /app/target/*.war /opt/tomcat/webapps/ROOT.war

# Porta dinâmica
ENV PORT=8080
EXPOSE ${PORT}

# Comando de execução
ENTRYPOINT ["/bin/bash", "-c", "/opt/tomcat/bin/catalina.sh run"]
