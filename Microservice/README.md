# Microservice Using Spring cloud 

Initial Version: 0.0.1
* Basic functionality of creating Microserice using Spring cloud and Spring Boot
  1. Created User-service application which run in port 9001
  2. Created Department-service application which run in port 9002
  3. Created Registry-service application. User-service application and Department-service application kept in Eureka server using Registry-service application where Department service is communicating through the user service
  4. Created cloud-Gateway service. Now user and department services will go through the cloud-Gateway service application. All services are communicate with a service name instead of the ip or port. There is a route config in the sloud-Gateway configuration. 
	
* 11-03-2021 All applications are communicating with the cloud gateway routes in a single port of cloud-Gateway. 




