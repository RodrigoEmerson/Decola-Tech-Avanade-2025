# Avanade Dev Bootcamp 2025

## Decola Tech 2025

### Java RESTful API criada para a Bootcamp 2025.

```mermaid
classDiagram
    class Product {
        +int id
        +String name
        +String description
        +String category
        +String brand
        +String barcode
        +double price
        +int stock
        +String expirationDate
    }

    class Supplier {
        +String name
        +String cnpj
        +String phone
    }

    class Feature {
        +String icon
        +String description
    }

    class Promotion {
        +double discount
        +double promotionalPrice
    }

    

    Product "1" -- "1..*" Feature : contains
    Product "1" -- "1" Supplier : has
    Product "1" -- "0..1" Promotion : offers
   ```

## CORREÇÔES

### - Versionamento com o SWAGGER!

    Utilizando o JAVA 21 / SPRING BOOT 3.4.4 
    implementation 'org.springdoc:springdoc-openapi-starter-webmvc-ui:2.8.5'

    Utilizando o JAVA 17 / SPRING BOOT 3.1.1
	implementation 'org.springdoc:springdoc-openapi-starter-webmvc-ui:2.1.0'

    OpenAPI (Swagger) https://github.com/springdoc/springdoc-openapi



  
### - Formato da conexão com o Railway!
 -application-prd.yml

 Substituir o {} junto com seu conteúdo:
 Exemplo: jdbc:postgresql://{host}:{porta}/{banco}
 Exemplo: jdbc:postgresql://localhost:5432/seubanco
 
 spring:
  datasource:
    url: jdbc:postgresql://{HOST}:{PORT}/{DATABASE}?user={USER}&password={PASSWORD}
    driver-class-name: org.postgresql.Driver
  jpa:
    hibernate:
      ddl-auto: validate  # 'none', 'create', 'validate', dependendo da sua necessidade
    properties:
      hibernate.dialect: org.hibernate.dialect.PostgreSQLDialect
      hibernate.format_sql: true
      hibernate.show_sql: true




( Meus primeiros projeto utilizei o JAVA 21, SPRING BOOt 3.4.4, até que resolvi realizar a troca das versões, resolvendo uma parte, e surgindo outros Erros )
