# Etapa 1: Build
FROM eclipse-temurin:21-jdk-alpine AS build
WORKDIR /app

# Copiar pom e mvnw
COPY pom.xml mvnw ./
COPY .mvn .mvn

# Dar permissão de execução para o mvnw
RUN chmod +x mvnw

# Baixar dependências offline
RUN ./mvnw dependency:go-offline

# Copiar código fonte
COPY src ./src

# Gerar jar (ou nativo, se tiver profile native)
RUN ./mvnw clean package -DskipTests

# Etapa 2: Imagem final mínima
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

# Copiar o jar gerado
COPY --from=build /app/target/jsf-spring-1.0.0.jar ./jsf-spring.jar

# Expõe a porta
EXPOSE 8080

# Inicializar aplicação
ENTRYPOINT ["java", "-jar", "jsf-spring.jar"]
