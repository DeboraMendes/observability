# Observablity

Exemplo de Observablity.

## Requisitos

Para buildar e executar a aplicação, você precisa ter baixado e configurado:

- [JDK 17](https://www.oracle.com/br/java/technologies/javase/jdk17-archive-downloads.html)
- [Maven 3](https://maven.apache.org)

## Build da applicação
```shell
cd observability
mvn install
```


## Como rodar a aplicação

Existem várias maneiras de executar uma aplicação Spring Boot em sua máquina local. 
Uma maneira é executar o método `main` na classe `com.deboramendes.observability.ObservabilityApplication` do seu IDE.

## Zipkin

É necessário um servidor Zipkin.
Atualmente não existe um Saas do Zipkin.
O início mais rápido é utilizando o Docker.
O [Quickstart do Zipkin](https://zipkin.io/pages/quickstart) fornece o comando para imagem:
```shell
docker run -d -p 9411:9411 openzipkin/zipkin    
```
A partir desse momento já possível acessar a [IU do Zipkin](http://localhost:9411/zipkin/).
