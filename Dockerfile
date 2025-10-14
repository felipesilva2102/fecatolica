### Etapa 1: Build com Maven (Java 21)
FROM maven:3.9.9-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

### Etapa 2: WildFly + Java 20
FROM eclipse-temurin:20-jdk
WORKDIR /opt/jboss

# Baixa e instala o WildFly 36
RUN curl -L https://github.com/wildfly/wildfly/releases/download/36.0.1.Final/wildfly-36.0.1.Final.tar.gz \
    | tar zx && mv wildfly-36.0.1.Final wildfly

# Copia a aplicação para o diretório de deployments
COPY --from=build /app/target/*.war /opt/jboss/wildfly/standalone/deployments/ROOT.war

# Define a porta de ambiente
ENV PORT=8080

# Expõe a porta
EXPOSE ${PORT}

# Inicia o WildFly escutando na porta dinâmica (nota: usar shell para expandir $PORT)
CMD sh -c "/opt/jboss/wildfly/bin/standalone.sh -b 0.0.0.0 -Djboss.http.port=${PORT}"
