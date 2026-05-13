# 👨‍💼 Employee Payroll Spring Boot Application

## 📖 Overview

The **Employee Payroll Spring Boot Application** is a backend-based project developed using **Spring Boot** to manage employee payroll operations efficiently.  
This project demonstrates the implementation of RESTful APIs along with important Spring Boot concepts such as validation, logging, profiles, exception handling, DTO architecture, and service-layer design.

The application follows a clean layered architecture and industry-standard backend development practices.

---

# 🚀 Features

✅ Employee Management REST APIs  
✅ Layered Spring Boot Architecture  
✅ DTO & Model Separation  
✅ In-Memory Data Storage  
✅ Validation & Custom Exception Handling  
✅ Logging using Lombok  
✅ Environment-specific Spring Profiles  
✅ CRUD Operations for Employees  
✅ Clean and Maintainable Code Structure  

---

# 🛠️ Tech Stack

- ☕ Java
- 🌱 Spring Boot
- 📦 Maven
- 🔹 Lombok
- ✅ Spring Validation
- 🔄 REST APIs
- 🧠 Spring Profiles
- 🖥️ IntelliJ IDEA

---

# 📂 Project Structure

```text
employeepayrollapp/
│
├── controller/
├── dto/
├── model/
├── service/
├── exception/
├── resources/
│   ├── application.properties
│   ├── application-dev.properties
│   ├── application-prod.properties
│
└── EmployeepayrollappApplication.java
```

---

# 📌 Use Cases Implemented

| Use Case | Description |
|----------|-------------|
| **UC1** | Create Employee Payroll Spring Boot Project |
| **UC2** | Implement REST Controller HTTP Methods |
| **UC3** | Introduce DTO and Model Layer |
| **UC4** | Implement Service Layer Architecture |
| **UC5** | Store Employee Data In-Memory |
| **UC6** | Integrate Lombok Annotations |
| **UC7** | Add Logging Functionality |
| **UC8** | Configure Spring Profiles |
| **UC9** | Add Request Validation |
| **UC10** | Handle Custom Validation Exceptions |
| **UC11** | Implement Employee Not Found Exception |

---

# 🌐 REST API Endpoints

## Employee Payroll APIs

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/employeepayrollservice/` | Get all employees |
| GET | `/employeepayrollservice/get/{empId}` | Get employee by ID |
| POST | `/employeepayrollservice/create` | Create new employee |
| PUT | `/employeepayrollservice/update/{empId}` | Update employee |
| DELETE | `/employeepayrollservice/delete/{empId}` | Delete employee |

---

# 🧠 Core Concepts Implemented

## 🔹 DTO & Model Architecture

Created:

- `EmployeePayrollDTO`
- `EmployeePayrollData`

Used:
- DTO for API request handling
- Model for response and storage

---

## 🔹 Service Layer

Implemented:

- `IEmployeePayrollService`
- `EmployeePayrollService`

The controller communicates with the service layer to maintain separation of concerns.

---

## 🔹 In-Memory Storage

Used:

```java
List<EmployeePayrollData> employeeList
```

Supported operations:

- Add Employee
- Update Employee
- Delete Employee
- Retrieve Employee

---

# ⚡ Lombok Integration

Integrated Lombok annotations for reducing boilerplate code.

Used annotations:

```java
@Data
@NoArgsConstructor
@AllArgsConstructor
```

---

# 📝 Logging Support

Logging added using Lombok's `@Slf4j`.

Example:

```java
log.info("Creating employee");
log.error("Error occurred");
```

---

# 🌱 Spring Profiles

Configured multiple environment profiles.

### Files Created

```text
application.properties
application-dev.properties
application-prod.properties
```

### Default Profile

```properties
spring.profiles.active=dev
```

### Development Profile

```properties
logging.level.root=INFO
```

### Production Profile

```properties
logging.level.root=ERROR
```

---

# ✅ Validation

Implemented validation using:

```java
@NotEmpty
@Pattern
```

### Example

```java
@NotEmpty(message="Name cannot be empty")
@Pattern(regexp="^[A-Z][a-zA-Z\\s]{2,}$")
```

Validation added for:

- Create Employee API
- Update Employee API

---

# ⚠️ Exception Handling

## Custom Validation Exception

Implemented using:

```java
@ControllerAdvice
```

Handled:

```java
MethodArgumentNotValidException
```

### Sample Response

```json
{
  "name": "Employee name cannot be empty"
}
```

---

## Employee Not Found Exception

Created custom exception:

```java
EmployeePayrollException
```

Thrown using:

```java
throw new EmployeePayrollException("Employee not found")
```

Handled via:

```java
@ExceptionHandler
```

### Sample Response

```json
{
  "message": "Employee with id not found"
}
```

---

# 📦 Dependencies Used

- Spring Boot Starter Web
- Spring Boot DevTools
- Lombok
- Spring Validation
- Spring Boot Starter

---

# ▶️ Running the Application

## Step 1 — Clone Repository

```bash
git clone <repository-url>
```

---

## Step 2 — Navigate to Project Directory

```bash
cd employeepayrollapp
```

---

## Step 3 — Run the Application

Run:

```text
EmployeepayrollappApplication.java
```

Server starts successfully on:

```text
Tomcat started on port 8080
```

---

# 🧪 API Testing

## Browser Test

```text
http://localhost:8080/employeepayrollservice/
```

---

## CURL Examples

### Create Employee

```bash
curl -X POST http://localhost:8080/employeepayrollservice/create
```

### Get Employee

```bash
curl http://localhost:8080/employeepayrollservice/get/1
```

### Update Employee

```bash
curl -X PUT http://localhost:8080/employeepayrollservice/update/1
```

### Delete Employee

```bash
curl -X DELETE http://localhost:8080/employeepayrollservice/delete/1
```

---

# 🌿 Git Workflow & Branching

This project follows a feature-based Git workflow.

### Feature Branches

```text
feature/UC1-create-project
feature/UC2-rest-controller
feature/UC3-dto-model
feature/UC4-service-layer
feature/UC5-memory-storage
feature/UC6-lombok
feature/UC7-logging
feature/UC8-spring-profiles
feature/UC9-validation
feature/UC10-custom-exception
feature/UC11-employee-not-found
```

---

# 📚 Learning Outcomes

Through this project, the following concepts were explored:

- Spring Boot Project Setup
- REST API Development
- DTO & Model Architecture
- Service Layer Design
- In-Memory Data Management
- Lombok Integration
- Logging Mechanisms
- Spring Profiles
- Validation Techniques
- Exception Handling

---

# 👨‍💻 Developer

**Developed by Kavish**

Backend project created for learning and implementing Spring Boot fundamentals and enterprise backend concepts.

---

# 📜 License

This project is intended for educational and learning purposes only.

```
