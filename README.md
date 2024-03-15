# spring-boot-gradle-mart-api

## Product Controller Endpoints
```bash
/products
# products (read, create, update, no delete)
``` 
```bash
/all/products
# products (read, create, update, no delete)
```
```bash
/home
```

## Product Controller Endpoints

```bash
/todos
# todos (no read, no create, no update, no delete) just dummy
``` 
```bash
/all/todos
# todos ( read, no create, no update, no delete) just dummy
``` 

## Models

```Java
class Product{}
class Todos{}
```
## Repository

```Java
class ProductRepository{}
```

## Database

My SQL Database

````
server.port=8080
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/oftmart
spring.datasource.username=shoppy
spring.datasource.password=#Mulalo96
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
#spring.jpa.show-sql: true
spring.jackson.serialization.indent_output=true
```