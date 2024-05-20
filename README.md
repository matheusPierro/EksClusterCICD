# Projeto CI/CD para EKS Cluster

Este projeto demonstra a implementação de um pipeline de integração contínua e entrega contínua (CI/CD) utilizando Jenkins, Amazon EKS (Elastic Kubernetes Service) e a AWS SDK para Java. O objetivo é automatizar o processo de desenvolvimento, teste e deployment de uma aplicação Java com Spring Boot em um cluster Kubernetes gerenciado pela AWS.

## Visão Geral

O pipeline é projetado para construir, testar e implantar uma aplicação Java usando Spring Boot em um cluster Kubernetes no EKS. A automação é realizada através de Jenkins, com interações programáticas com o EKS via AWS SDK para Java.

## Pré-Requisitos

- Jenkins rodando em um container Docker com plugins para Git, Docker e Kubernetes
- Docker e Kubernetes CLI (kubectl) instalados
- JDK e AWS SDK para Java configurados para gerenciar recursos no EKS

## Configuração

### Configurar Jenkins

1. Instale o Jenkins em um container Docker com os plugins necessários:
   - Git
   - Docker pipeline
   - Kubernetes

2. Configure o SCM para conectar ao seu repositório Git que contém o código da aplicação e o `Jenkinsfile`.

### Configuração do Código Java com AWS SDK

Integre o AWS SDK para Java em seu projeto para gerenciar recursos do EKS diretamente através do código Java. Isso permite operações como criar ou atualizar clusters, gerenciar nós e configurar serviços dentro do EKS.

1. Adicione a dependência do AWS SDK para Java no seu `pom.xml` ou `build.gradle`.
2. Utilize a classe `EksClient` do SDK para executar operações necessárias como parte do seu pipeline de CI/CD.

## Uso

Para executar o pipeline de CI/CD:

1. Faça push de uma mudança para o repositório Git configurado no Jenkins.
2. Acesse o Jenkins, vá ao job configurado e clique em "Build Now".
3. Monitore o progresso do build através da interface do Jenkins.

## Contribuindo

Contribuições são bem-vindas! Se você tiver melhorias ou correções, por favor, faça um fork do repositório, faça suas alterações, e submeta um pull request.

## Licença

[Inserir tipo de licença aqui] - Este projeto está licenciado sob a [Inserir tipo de licença aqui], o que permite a utilização, distribuição e reprodução em qualquer meio, desde que a obra original seja propriamente citada.

## Autores

- Matheus Pierro - Desenvolvedor do projeto
- [Inserir outros colaboradores aqui]
