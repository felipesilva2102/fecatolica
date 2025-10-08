# Stage 1: Build Maven
FROM maven:3.9.3-eclipse-temurin-21 AS build

WORKDIR /app

# Copia arquivos de configuração do Maven
COPY pom.xml mvnw ./
COPY .mvn .mvn

# Baixa dependências offline para acelerar builds
RUN ./mvnw dependency:go-offline

# Copia código fonte
COPY src ./src

# Build do jar sem testes
RUN ./mvnw clean package -DskipTests

# Stage 2: Runtime leve
FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

# Copia o jar gerado
COPY --from=build /app/target/jsf-spring-1.0.0.jar ./jsf-spring-1.0.0.jar

# Variáveis de ambiente
ENV JAVA_OPTS="-Xmx768m -Dspring.profiles.active=default"
ENV SPRING_OUTPUT_ANSI_ENABLED=ALWAYS
ENV LOGGING_LEVEL_ROOT=INFO
ENV LOGGING_LEVEL_ORG_SPRINGFRAMEWORK=DEBUG

# Porta que o Tomcat embutido vai expor
EXPOSE 8080

# Comando de inicialização
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar jsf-spring-1.0.0.jar"]
