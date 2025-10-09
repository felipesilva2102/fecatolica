# ===============================
# Etapa 1: Build da aplicação
# ===============================
FROM eclipse-temurin:21-jdk-alpine AS build
WORKDIR /app

# Copiar arquivos essenciais do Maven
COPY pom.xml mvnw ./
COPY .mvn .mvn
RUN chmod +x mvnw

# Adicionar um settings.xml com mirror estável (Aliyun)
RUN mkdir -p /root/.m2 && echo '<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0">
  <mirrors>
    <mirror>
      <id>aliyun</id>
      <mirrorOf>*</mirrorOf>
      <url>https://maven.aliyun.com/repository/public</url>
    </mirror>
  </mirrors>
</settings>' > /root/.m2/settings.xml

# Baixar dependências Maven (sem precisar compilar o código ainda)
RUN ./mvnw dependency:go-offline -B

# Copiar o código-fonte
COPY src ./src

# Compilar e empacotar a aplicação
RUN ./mvnw clean package -DskipTests -B

# ===============================
# Etapa 2: Imagem final mínima
# ===============================
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

# Copiar o JAR gerado da etapa anterior
COPY --from=build /app/target/jsf-spring-1.0.0.jar ./app.jar

# Expor a porta padrão
EXPOSE 8080

# Comando de inicialização
ENTRYPOINT ["java", "-jar", "app.jar"]
