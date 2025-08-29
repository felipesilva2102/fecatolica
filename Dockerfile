# Use uma imagem oficial do WildFly (atualizada)
FROM quay.io/wildfly/wildfly:26.1.0.Final

# Mantenedor (opcional)
LABEL maintainer="Felipe Silva <felipefrancelino2015@gmail.com>"

# Copie o WAR gerado pelo Maven para o diretório de deploy do WildFly
# Certifique-se que o WAR esteja no target/santo-terco-1.0-SNAPSHOT.war
COPY target/santo-terco-1.0-SNAPSHOT.war /opt/jboss/wildfly/standalone/deployments/santo-terco.war

# Exponha a porta padrão do WildFly
EXPOSE 8080

# Comando padrão para iniciar o WildFly
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0"]
