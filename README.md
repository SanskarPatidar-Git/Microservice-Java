Microservice -> Dividing the Monolithic application into multiple services.

This is a simple java application based on microservice architecture which is divided into two services.
Service-B contains mwthods for creating and reading skills through database(MySql) and calling this services from another service which is Service-A.

Coonecting this services through a network we had used Eureka Service Registry.
Calling a service from another service FeignClient is used.
ApiGateway is used to which user will interact and act as a single entry point for each service.

Info-
FeignClient is used to call an another microservice but it also required the metadata of service like url,port on which the instance of that application is running for that it needs
service registry to identify the instance and pass the request to that service.

Impl of Eureka Server-
1. Add dependency of Eureka server.
2. Annote main class with @EnableEurekaServer to initialize the Eureka server and make some configs if required in application.properties file.

Impl of FeignClient-
1. Add dependency of OpenFeign.
2. Annote main class with @EnableFeignClient
3. Create interface which contains method signature of services which you need to call and annote that interface with @FeignClient and pass the param of service name which holds that url.

As we are using FeignClient which itself configure the load balancing and passing the request to instance which has lowest request. 
