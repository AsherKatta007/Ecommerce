#E-Commerce Website

This is a Java Spring Boot backend project for an E-Commerce platform, designed for high performance and scalability. The project integrates multiple cloud services, follows best coding practices, and ensures efficient API performance.

🚀 Features & Tech Stack
📌 Cloud Services & Infrastructure
AWS RDS: Used for database management.
AWS EC2: Deployed for scaling and handling traffic efficiently.
Redis Caching: Optimized API calls by 85–95%, reducing response time significantly.
💳 Payment Gateway Integration
Stripe integrated for seamless payments.
Implemented callbacks and webhooks to handle payment confirmations.
🔗 Third-Party API Integration
Integrated external APIs for fetching product data.
🛠 Tech Stack
Java
Spring Boot
Hibernate
Spring Data JPA
MySQL (AWS RDS)
Redis
AWS EC2
Stripe
Maven
Lombok
🎯 Design & Best Practices
✅ SOLID Principles
The project follows SOLID principles to ensure maintainability and scalability.

S — Single Responsibility Principle: Each class has a single well-defined responsibility.
O — Open/Closed Principle: Implemented abstraction using service interfaces.
L — Liskov Substitution Principle: Payment implementations follow interface contracts.
I — Interface Segregation Principle: Separate interfaces for Product, Category, and Payment services.
D — Dependency Inversion Principle: Constructor-based dependency injection throughout the application.
🛠 Exception Handling
Implemented custom exceptions:

ProductNotFoundException
CategoryNotFoundException
Centralized exception handling using ControllerAdvice.

📂 Project Structure
src/main/java/com/scaler/backendproject

├── advice
│   └── ControllerAdvice.java

├── configs
│   ├── RedisTemplateConfig.java
│   └── AuditConfig.java

├── controller
│   ├── ProductController.java
│   ├── CategoryController.java
│   └── PaymentController.java

├── dto
│   ├── PaymentRequestDTO.java
│   └── ErrorDTO.java

├── exceptions
│   ├── ProductNotFoundException.java
│   └── CategoryNotFoundException.java

├── models
│   ├── BaseModel.java
│   ├── Product.java
│   └── Category.java

├── repository
│   ├── ProductRepository.java
│   └── CategoryRepository.java

├── service
│   ├── ProductService.java
│   ├── CategoryService.java
│   ├── PaymentService.java
│   └── StripePaymentGatewayImplementation.java
🚀 How to Run Locally
Clone the Repository
git clone https://github.com/AsherKatta007/Ecommerce.git
Navigate to the Project
cd Ecommerce/backendproject
Configure the Database
Configure MySQL (or AWS RDS) credentials in application.properties.

Configure Redis
Ensure Redis is installed and running.

Run the Application
mvn spring-boot:run
Access the Application
http://localhost:8080
📌 API Endpoints
Method	Endpoint	Description
POST	/product	Create a new product
GET	/product/{id}	Get a product by ID
GET	/products?pageNumber=1&pageSize=10&fieldName=price	Get paginated products
POST	/payments	Create a payment link
POST	/webhook	Handle payment webhooks