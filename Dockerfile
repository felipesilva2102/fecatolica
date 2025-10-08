# Etapa 1: Build da imagem nativa
FROM eclipse-temurin:21-jdk-alpine AS build
WORKDIR /app

# Copiar pom e baixar dependências
COPY pom.xml mvnw ./
COPY .mvn .mvn
RUN ./mvnw dependency:go-offline

# Copiar o código fonte
COPY src ./src

# Gerar o jar nativo (substitua 'jsf-spring' pelo nome do seu projeto se necessário)
RUN ./mvnw clean package -Pnative -DskipTests

# Etapa 2: Imagem final mínima
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

# Copiar binário nativo
COPY --from=build /app/target/jsf-spring-1.0.0 /app/jsf-spring

# Expõe a porta do Spring Boot
EXPOSE 8080

# Comando de inicialização
ENTRYPOINT ["./jsf-spring"]
