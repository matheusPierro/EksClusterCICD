FROM jenkins/jenkins:lts
USER root

# Instalando Docker dentro do Jenkins para permitir builds Docker
RUN curl -sSL https://get.docker.com/ | sh
RUN usermod -aG docker jenkins

# Instalando o Jenkins Plugin Manager
RUN curl -L "https://github.com/jenkinsci/plugin-installation-manager-tool/releases/download/2.12.6/jenkins-plugin-manager-2.12.6.jar" -o /opt/jenkins-plugin-manager.jar

# Instalando plugins do Jenkins diretamente sem arquivo de plugins
RUN java -jar /opt/jenkins-plugin-manager.jar --war /usr/share/jenkins/jenkins.war --plugins git docker-workflow kubernetes

# Voltando ao usuário jenkins
USER jenkins

# docker run -p 8080:8080 -p 50000:50000 -v //var/run/docker.sock:/var/run/docker.sock -v C:/jenkins_home:/var/jenkins_home --name jenkins meu-jenkins