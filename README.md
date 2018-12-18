# opentech project

Spring Boot Rest Repository with Swagger

Implementation of Swagger in Rest Spring Boot API.

1. Add Maven Configuration: 
	```
                <dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger2</artifactId>
			<version>2.9.2</version>
		</dependency>

		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger-ui</artifactId>
			<version>2.9.2</version>
		</dependency>
         ```


2. Add Swagger Config:
   ```
   @Configuration
   @EnableSwagger2
   public class SwaggerConfig {
       @Bean
       public Docket api() {
           return new Docket(DocumentationType.SWAGGER_2)
                   .select()
                   .apis(RequestHandlerSelectors.any())
                   .paths(PathSelectors.ant("/talks/**"))
                   .build()
                   .apiInfo(apiInfo());
       }
   
       private ApiInfo apiInfo() {
           return new ApiInfo(
                   "OpenTech REST API",
                   "Some Talks are coming.",
                   "OpenTech API",
                   "Terms of service",
                   new Contact("Rafael Lopez", "http://www.pyxisportal.com", "rafael.lopez@pyxisportal.co"),
                   "License of API", "API license URL", Collections.emptyList());
       }
   }
   ```
3. Modify file applitacion.properties:
  ```
     server.port=8080
     server.servlet.context-path=/opentech
  ```

4. Database Creation:
 ```
mysql> create database opentech; -- Create the new database
mysql> create user 'opentech'@'%' identified by 'opentech'; -- Creates the user
mysql> grant all on opentech.* to 'opentech'@'%'; -- Gives all the privileges to the new user on the newly created database
```  
5. Database confiration: 
```
spring.jpa.hibernate.ddl-auto=create
spring.datasource.url=jdbc:mysql://localhost:3306/opentech
spring.datasource.username=opentech
spring.datasource.password=opentech
```

6. Build the project: 

```./mvnw clean install```

7. Run the project:

```./mvnw spring-boot:run```
