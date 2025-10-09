# Etapa 1: Build
FROM eclipse-temurin:21-jdk-alpine AS build
WORKDIR /app

# Copiar pom e scripts Maven
COPY pom.xml mvnw ./
COPY .mvn .mvn
RUN chmod +x mvnw

# Criar diretório Maven local e copiar config com mirror
RUN mkdir -p /root/.m2
COPY settings.xml /root/.m2/settings.xml

# Baixar dependências (precisa de internet)
RUN ./mvnw dependency:go-offline -B

# Copiar código fonte
COPY src ./src

# Fazer o build
RUN ./mvnw clean package -DskipTests

# Etapa 2: Imagem final mínima
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

# Copiar o jar gerado
COPY --from=build /app/target/jsf-spring-1.0.0.jar ./jsf-spring.jar

# Expõe a porta
EXPOSE 8080

# Executar aplicação
ENTRYPOINT ["java", "-jar", "jsf-spring.jar"]
