# Proyecto Librería - Spring Boot + PostgreSQL

Este proyecto es un sistema básico para una librería que maneja libros, autores, clientes y ventas. Está construido con Spring Boot y PostgreSQL.

## Requisitos

- Java 17+
- Maven
- PostgreSQL
- IDE como IntelliJ, Eclipse o VSCode

## Configuración de la base de datos

1. Crea la base de datos en PostgreSQL:

```sql
CREATE DATABASE libreria_db;
CREATE USER cl22006 WITH PASSWORD 'cl22006';
GRANT ALL PRIVILEGES ON DATABASE libreria_db TO cl22006;
```
Configura el archivo src/main/resources/application.properties:
```sql
spring.datasource.url=jdbc:postgresql://localhost:5432/libreria_db
spring.datasource.username=cl22006
spring.datasource.password=cl22006

spring.jpa.hibernate.ddl-auto=create
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

```
Desde el IDE
Ejecuta la clase LibreriaApplication.java.

```bash
./mvnw spring-boot:run
```

```bash
mvn spring-boot:run
```
