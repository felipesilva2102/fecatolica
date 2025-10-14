### Etapa 1: Build com Maven (Java 21)
FROM maven:3.9.9-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

### Etapa 2: WildFly + Java 21
FROM eclipse-temurin:21-jdk
WORKDIR /opt/jboss

# Baixa e instala o WildFly 36
RUN apt-get update && apt-get install -y curl tar && \
    curl -L https://github.com/wildfly/wildfly/releases/download/36.0.1.Final/wildfly-36.0.1.Final.tar.gz -o wildfly.tar.gz && \
    tar -xzf wildfly.tar.gz && \
    mv wildfly-36.0.1.Final wildfly && \
    rm wildfly.tar.gz

# Copia o WAR gerado
COPY --from=build /app/target/*.war /opt/jboss/wildfly/standalone/deployments/ROOT.war

# Define a porta
ENV PORT=8080
EXPOSE ${PORT}

# Corrige permissões e inicia o servidor
RUN chmod +x /opt/jboss/wildfly/bin/standalone.sh
CMD sh -c "/opt/jboss/wildfly/bin/standalone.sh -b 0.0.0.0 -Djboss.http.port=${PORT}"
