

# 🛒 Enterprise Full-Stack POS System (Spring Boot + Vanilla JS & Ajax)

[![Java](https://img.shields.io/badge/Language-Java%2017-orange.svg)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Framework-Spring%20Boot%203.x-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![JavaScript](https://img.shields.io/badge/Frontend-Vanilla%20JS%20%26%20jQuery%20%28Ajax%29-blue.svg)](https://jquery.com/)
[![License](https://img.shields.io/badge/Architecture-Layered%20%2F%20Enterprise-red.svg)]()

A production-ready, full-stack **Point of Sale (POS) System** engineered with an enterprise-level architecture. This project showcases the complete decoupling of a **Spring Boot REST API** backend from an interactive frontend built using **HTML5, CSS3, and Vanilla JavaScript with Ajax (jQuery)** for seamless, real-time client-server communication without page reloads.

---

## 📺 Project Presentation & Walkthrough

Watch the full system architecture presentation and live code walkthrough on YouTube:  
👉 **[Watch the Video Walkthrough on YouTube](https://www.youtube.com/watch?v=IkQwdo4DcX8)**

---

## ✨ Core Engineering Capabilities

### 🌐 Decoupled Frontend Features
* **Asynchronous Data Layer (Ajax):** Utilizes jQuery Ajax engines to serialize form structures into JSON payloads, executing HTTP requests asynchronously to prevent overhead thread blocking.
* **Full CRUD Panels:** Dedicated interfaces for **Customer Management**, **Item/Inventory Cataloging**, and an interactive **Place Order Dashboard**.
* **Dynamic Validation Display:** Real-time extraction of backend validation constraints to display clear, localized error labels dynamically.

### ☕ Robust Backend Infrastructure
* **Strict Layered Architecture:** Organized cleanly across Controller, Service, and Repository layers to enforce absolute separation of concerns.
* **Enterprise Validation Pipeline:** Employs `spring-boot-starter-validation` directly onto Data Transfer Objects (DTOs), intercepting invalid criteria using constraints like `@NotNull`, `@NotBlank`, and `@Size`.
* **Centralized Global Exception Handler:** Built using `@RestControllerAdvice` and `@ExceptionHandler` annotations to cleanly trap system errors (e.g., `NullPointerException`, `MethodArgumentNotValidException`) and standardize output HTTP status codes inside a unified `APIResponse` format.
* **Spring Dependency Injection & IOC:** Leverages `@RestController`, `@Service`, and `@Repository` core stereotypes to enforce thread-safe **Singleton** bean lifetimes managed natively by the Spring IoC Container.
* **Data Persistence:** Automated interaction mappings via **Spring Data JPA** interfaces connected to a relational schema.

---

## 📁 Project Architecture & Directory Structure

```text
Pos-Spring-with-utub-video/
│
├── Back_End/                    # Spring Boot REST API Core Backend
│   ├── .mvn/
│   ├── src/main/java/           # Tiered packages (Controller, Service, Repository, Dto, Entity)
│   ├── pom.xml                  # Build manager with Starter Web, Validation, and Data JPA
│   └── mvnw
│
├── Front_End/                   # Vanilla UI Decoupled Client
│   ├── Assest/
│   │   ├── lib/
│   │   │   └── jquery-3.7.1.min.js  # Dedicated script engine for Ajax communications
│   │   └── js/
│   │       └── customer.js     # Modular asynchronous view event orchestrators
│   └── page/
│       ├── customer.html        # Customer Lifecycle Screen
│       ├── Dashbord.html        # Central Analytics View
│       ├── item.html            # Inventory Management Screen
│       └── place-order.html     # Relational Billing Transaction Terminal
│
└── index.html                   # Core Gateway UI Bootstrapper
