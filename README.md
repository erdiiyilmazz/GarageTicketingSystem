# Garage Ticketing System

REST Controller that allows implementing park, leave and status actions for the vehicles Car, Truck and Jeep out of 10 slots garage.

### System Features

JDK 1.8\
Spring Boot 2.6.3\
Maven 3.6.3\
Default Port 8083

### Build

`./mvnw clean install`

### Run

`./mvnw spring-boot:run`

**REST Calls can be performed as below:**

**GET** status > http://localhost:8083/garage/status

**POST** park >  http://localhost:8083/garage/park/Car?color=White&plate=45-HT-6655

**DELETE** leave > http://localhost:8083/garage/leave/1



