# ===============================
# Etapa 1: Build da aplicação
# ===============================
FROM eclipse-temurin:21-jdk-alpine AS build
WORKDIR /app

# Copiar arquivos essenciais do Maven
COPY pom.xml mvnw ./
COPY .mvn .mvn
RUN chmod +x mvnw

# Criar settings.xml com mirror estável (Aliyun)
RUN mkdir -p /root/.m2 && \
    echo "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n\
<settings xmlns=\"http://maven.apache.org/SETTINGS/1.0.0\"\n\
           xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n\
           xsi:schemaLocation=\"http://maven.apache.org/SETTINGS/1.0.0 https://maven.apache.org/xsd/settings-1.0.0.xsd\">\n\
  <mirrors>\n\
    <mirror>\n\
      <id>aliyun</id>\n\
      <mirrorOf>*</mirrorOf>\n\
      <url>https://maven.aliyun.com/repository/public</url>\n\
    </mirror>\n\
  </mirrors>\n\
</settings>" > /root/.m2/settings.xml

# Baixar dependências Maven
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
COPY --from=build /app/target/*.jar ./app.jar

# Expor a porta padrão
EXPOSE 8080

# Comando de inicialização
ENTRYPOINT ["java", "-jar", "app.jar"]
