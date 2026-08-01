# 🛒 E-Commerce Backend API

A scalable and high-performance **Java Spring Boot** backend application for an E-Commerce platform. The project follows industry-standard architecture, SOLID principles, and integrates cloud services, caching, payment processing, and third-party APIs to build a robust RESTful backend.

---

# 🚀 Features

- RESTful APIs for Product, Category, and Payment Management
- Product Pagination and Sorting
- Redis Caching for improved API performance
- Stripe Payment Gateway Integration
- Third-Party Product API Integration
- Global Exception Handling
- Layered Architecture
- Constructor-based Dependency Injection
- Database Migration using Flyway

---

# ☁️ Cloud & Infrastructure

- **AWS RDS** – Managed MySQL Database
- **AWS EC2** – Application Deployment
- **Redis** – In-memory caching
- **Stripe** – Payment Gateway

---

# 🛠️ Tech Stack

- Java 17
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate
- MySQL
- Redis
- Flyway
- Stripe API
- Maven
- Lombok

---

# 🏗️ Architecture

The project follows a layered architecture.

```
Controller
      ↓
Service
      ↓
Repository
      ↓
Database
```

Project Layers:

- Controller Layer
- Service Layer
- Repository Layer
- Model Layer
- DTO Layer
- Configuration Layer

---

# 🎯 Design Principles

The application follows **SOLID Principles**.

### Single Responsibility Principle (SRP)

Each class has a single responsibility.

### Open Closed Principle (OCP)

Service implementations are extendable using interfaces.

### Liskov Substitution Principle (LSP)

Service implementations can be substituted without affecting application behavior.

### Interface Segregation Principle (ISP)

Separate interfaces are maintained for Product, Category, and Payment services.

### Dependency Inversion Principle (DIP)

Constructor-based dependency injection is used throughout the project.

---

# 🏛️ Design Patterns

- Strategy Pattern
- Repository Pattern
- DTO Pattern
- Dependency Injection
- Factory Pattern (Spring Bean Management)

---

# ⚠️ Exception Handling

Custom exceptions implemented:

- ProductNotFoundException
- CategoryNotFoundException

Global exception handling is implemented using:

- `@ControllerAdvice`

---

# 📂 Project Structure

```text
.
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── scaler
│   │   │           └── backendproject
│   │   │               ├── advice
│   │   │               ├── configs
│   │   │               ├── controller
│   │   │               ├── dto
│   │   │               ├── exceptions
│   │   │               ├── models
│   │   │               ├── repository
│   │   │               ├── service
│   │   │               └── BackendProjectApplication.java
│   │   │
│   │   └── resources
│   │       ├── application.properties
│   │       └── db
│   │           └── migration
│   │               └── V1__.sql
│   │
│   └── test
│       └── java
│
├── META-INF
├── .mvn
├── pom.xml
├── mvnw
├── mvnw.cmd
├── .gitignore
├── .gitattributes
└── README.md
```

---

# 🚀 Getting Started

## Clone the Repository

```bash
git clone https://github.com/AsherKatta007/Ecommerce.git
```

## Navigate to the Project

```bash
cd Ecommerce
```

## Configure Database

Update the MySQL (or AWS RDS) credentials in:

```
src/main/resources/application.properties
```

## Configure Redis

Ensure Redis Server is installed and running.

## Run the Application

Using Maven:

```bash
mvn clean install
mvn spring-boot:run
```

Or using Maven Wrapper:

```bash
./mvnw spring-boot:run
```

Windows:

```bash
mvnw.cmd spring-boot:run
```

---

# 🌐 API Endpoints

## Product APIs

| Method | Endpoint | Description |
|---------|----------|-------------|
| POST | `/product` | Create Product |
| GET | `/product/{id}` | Get Product by ID |
| GET | `/products` | Get Products with Pagination |

## Category APIs

| Method | Endpoint | Description |
|---------|----------|-------------|
| POST | `/category` | Create Category |
| GET | `/categories` | Get All Categories |
| GET | `/productsInCategory/{category}` | Get Products by Category |

## Payment APIs

| Method | Endpoint | Description |
|---------|----------|-------------|
| POST | `/payments` | Generate Stripe Payment Link |
| POST | `/webhook` | Stripe Webhook Callback |

---

# ⚡ Performance Optimizations

- Redis Caching
- Pagination
- Database Indexing
- Spring Dependency Injection
- JPA Repository Optimizations

---

# 📌 Future Enhancements

- JWT Authentication
- Role-Based Authorization
- Swagger / OpenAPI Documentation
- Docker Support
- CI/CD Pipeline
- Kubernetes Deployment

---

# 👨‍💻 Repository

GitHub Repository:

**https://github.com/AsherKatta007/Ecommerce**

---

## 📜 License

This project is developed for learning and educational purposes.