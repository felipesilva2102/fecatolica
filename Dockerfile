<<<<<<< HEAD
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
=======
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
>>>>>>> 7490e34c038d05bab60fb474b7faacb883bd8347
