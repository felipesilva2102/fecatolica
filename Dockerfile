### Etapa 1: Build com Maven (Java 21)
FROM maven:3.9.9-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

### Etapa 2: WildFly + Java 21
FROM eclipse-temurin:21-jdk
WORKDIR /opt/jboss

# Instala dependências e baixa o WildFly
RUN apt-get update && apt-get install -y curl tar && \
    curl -L https://github.com/wildfly/wildfly/releases/download/36.0.1.Final/wildfly-36.0.1.Final.tar.gz -o /tmp/wildfly.tar.gz && \
    tar -xzf /tmp/wildfly.tar.gz -C /opt/jboss && \
    mv /opt/jboss/wildfly-36.0.1.Final /opt/jboss/wildfly && \
    rm /tmp/wildfly.tar.gz && \
    chmod +x /opt/jboss/wildfly/bin/standalone.sh

# Copia o WAR compilado
COPY --from=build /app/target/*.war /opt/jboss/wildfly/standalone/deployments/ROOT.war

# Porta dinâmica
ENV PORT=8080
EXPOSE ${PORT}

# Comando de execução (corrigido)
ENTRYPOINT ["/bin/bash", "-c", "/opt/jboss/wildfly/bin/standalone.sh -b 0.0.0.0 -Djboss.http.port=${PORT}"]
