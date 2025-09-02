# Usar imagem oficial do Tomcat (versão 10 para compatibilidade com Jakarta EE 10)
FROM tomcat:10.1-jdk20

# Manter o Tomcat rodando em primeiro plano
CMD ["catalina.sh", "run"]

# Limpar aplicações padrão do Tomcat
RUN rm -rf /usr/local/tomcat/webapps/*

# Copiar o WAR gerado pelo Maven para a pasta webapps do Tomcat
COPY target/santo-terco-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war

# Expor porta padrão do Tomcat
EXPOSE 8080
