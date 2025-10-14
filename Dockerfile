# Stage 1: Build
FROM maven:3.9.5-eclipse-temurin-21 AS build

# Diretório de trabalho
WORKDIR /app

# Copiar pom.xml e baixar dependências
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copiar todo o código-fonte
COPY src ./src

# Build do JAR
RUN mvn clean package -DskipTests

# Stage 2: Runtime
FROM eclipse-temurin:21-jre-alpine

# Diretório de trabalho
WORKDIR /app

# Copiar JAR do stage de build
COPY --from=build /app/target/jsf-spring-1.0.0.jar app.jar

# Expor a porta padrão do Spring Boot
EXPOSE 8080

# Comando para iniciar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
