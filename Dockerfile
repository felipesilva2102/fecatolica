# Usar imagem oficial do Tomcat 10.1.24 com OpenJDK 21
FROM tomcat:10.1.24-jdk21

# Limpar aplicações padrão do Tomcat
RUN rm -rf /usr/local/tomcat/webapps/*

# Copiar o WAR gerado pelo Maven para a pasta webapps do Tomcat
COPY target/santo-terco-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war

# Expor porta padrão do Tomcat
EXPOSE 8080

# Manter o Tomcat rodando em primeiro plano
CMD ["catalina.sh", "run"]
