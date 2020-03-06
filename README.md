# spring-boot

Executando aplicações Spring Boot

## Pré-requisito
- Maven 4
- Java 11
- MySql 8

## Preparando ambiente

```
Altere os dados de conexão com o banco em: src/main/resources/application.properties (aplicação)
```
```
Altere os dados de conexão com o banco em: src/main/resources/flyway.properties (migration)
```

```
./mvnw clean package
java -jar target/analisedecredito-api-0.0.1-SNAPSHOT.jar
```

## Documentação Swagger

```
http://localhost:8080/swagger-ui.html#/
```

## Frontend

```
https://github.com/rmfwebmaster/analisedecredito-frontend
```