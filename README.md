📚 EDVO LMS – Learning Management System (Spring Boot)
Overview

EDVO LMS is a backend system built with Java + Spring Boot.
It includes a clean structure with controllers, services, repositories, and entities.
This project follows real enterprise architecture and FAANG engineering standards.

🚀 Features (Current Phase)

Basic Spring Boot setup

H2 in-memory database

MVC project structure

User entity + repository

REST endpoint skeleton

🛠 Tech Stack

Java 17

Spring Boot 3

Spring Web

Spring Data JPA

H2 Database

Lombok

Maven

▶️ Running the project

1. Clone the repo

git clone https://github.com/GulkaiyrTaiirbekova/edvo.git


2. Run the project

mvn spring-boot:run


3. H2 Console
Open:

http://localhost:8080/h2-console


Use JDBC URL:

jdbc:h2:mem:testdb

📁 Project Structure
com.edvo.edvo_lms
 ├── controller
 ├── service
 ├── repository
 └── model

🧩 Current Entity: User
Long id
String username
String passwordHash

🧪 Basic Test Endpoint
GET /hello