# ===============================
# Etapa 1: Build da aplicação
# ===============================
FROM eclipse-temurin:21-jdk-alpine AS build
WORKDIR /app

# Copiar arquivos essenciais do Maven
COPY pom.xml mvnw ./
COPY .mvn .mvn
RUN chmod +x mvnw

# Criar settings.xml com mirror Maven Central (100% compatível)
RUN mkdir -p /root/.m2 && cat > /root/.m2/settings.xml <<'EOF'
<?xml version="1.0" encoding="UTF-8"?>
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
           xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
           xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 https://maven.apache.org/xsd/settings-1.0.0.xsd">
  <mirrors>
    <mirror>
      <id>central</id>
      <mirrorOf>*</mirrorOf>
      <url>https://repo1.maven.org/maven2/</url>
    </mirror>
  </mirrors>
</settings>
EOF

# Copiar o código-fonte
COPY src ./src

# Compilar e empacotar a aplicação (sem testes)
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
ENTRYPOINT ["sh", "-c", "java -jar app.jar --server.port=$PORT"]
