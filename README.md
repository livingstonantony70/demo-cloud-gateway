# demo-cloud-gateway

```
<dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-gateway</artifactId>
</dependency>
```
```
server:
  port: 8084

spring:
  cloud:
    gateway:
      routes:
        #Route mapping
        - id: school-teachers
          uri: http://localhost:8082/
          predicates:
            - Path=/teachers/**

        - id: school-department
          uri: http://localhost:8081/
          predicates:
            - Path=/department/**

```