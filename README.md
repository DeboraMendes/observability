# Observablity

Exemplo de Observablity utilizando Micrometer Tracing (antigo Spring Cloud Sleuth), Zipkin, Prometheus e Grafana.

## Requirements

Para buildar e executar a aplicação, você precisa ter baixado e configurado:

- [JDK 17](https://www.oracle.com/br/java/technologies/javase/jdk17-archive-downloads.html)
- [Maven](https://maven.apache.org)

## Build application
```shell
cd observability
mvn install
```


## Run application

Existem várias maneiras de executar uma aplicação Spring Boot em sua máquina local. 
Uma maneira é executar o método `main` na classe `com.deboramendes.observability.ObservabilityApplication` do seu IDE.

## Servers

A aplicação utiliza Zipkin, Prometheus e Grafana, para criar os servidores, execute o comando Docker:

```shell
 docker-compose up 
```

### Zipkin

- [Zipkin IU](http://localhost:9411/zipkin/)

### Prometheus
- [Prometheus IU](http://localhost:9090/targets?search=)

### Grafana
- [Grafana IU](http://localhost:3000)
- User: `admin`
- Password: `admin`
- Datasource configuration:
  - Prometheus:
    - URL: http://host.docker.internal:9090
- Dashboards ready to import: https://grafana.com/grafana/dashboards/?plcmt=footer