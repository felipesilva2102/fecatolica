# Etapa 1: Build com Maven (Java 21)
FROM maven:3.9.9-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml .
# Baixa as dependências primeiro para aproveitar o cache do Docker
RUN mvn dependency:go-offline 
COPY src ./src
# Garante que o WAR final se chame ROOT.war
RUN mvn clean package -DskipTests

# Etapa 2: Servidor Tomcat Oficial (Java 21)
# Imagem oficial já vem com Tomcat 10.1.x e JDK 21 instalados
FROM tomcat:10.1-jdk21-temurin

# Remove aplicações padrão do Tomcat para segurança e limpeza
RUN rm -rf /usr/local/tomcat/webapps/*

# Copia o WAR gerado na etapa anterior
# Nota: No Tomcat oficial, o caminho padrão é /usr/local/tomcat/webapps/
COPY --from=build /app/target/ROOT.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080

# ENTRYPOINT padrão da imagem oficial já é o catalina.sh run
# Caso queira deixar explícito:
CMD ["catalina.sh", "run"]
