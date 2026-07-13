# AD Tech Enterprises Website

## Project Overview

This project is a responsive company website developed for **AD Tech Enterprises Pvt. Ltd.** It provides information about the company and its services, along with a Contact Us form where users can submit their details. The submitted data is stored in a MySQL database using a Spring Boot REST API.

---

## Features

- Responsive Landing Page
- Home, About, Services and Contact Sections
- Contact Form
- REST API Integration
- Data Stored in MySQL Database
- Clean and User-Friendly Interface

---

## Technologies Used

### Frontend
- HTML5
- CSS3
- JavaScript

### Backend
- Java
- Spring Boot
- Spring Data JPA

### Database
- MySQL

### Tools
- Spring Tool Suite (STS)
- Postman
- Git & GitHub
- Render
- Vercel

---

## Project Structure

```
ad-tech-enterprises
│
├── src
│   └── main
│       ├── java
│       │   └── com.adtech
│       │       ├── controller
│       │       ├── service
│       │       ├── repository
│       │       ├── entity
│       │       └── config
│       │
│       └── resources
│           ├── static
│           │   ├── index.html
│           │   ├── style.css
│           │   └── script.js
│           │
│           └── application.properties
│
├── pom.xml
└── README.md
```

---

## API Endpoint

### Save Contact Details

**POST**

```
/contact
```

### Request Body

```json
{
  "name": "Kalyani",
  "email": "kalyani@gmail.com",
  "company": "ABC Pvt Ltd",
  "message": "Interested in AI Automation"
}
```

### Response

```json
{
  "id": 1,
  "name": "Kalyani",
  "email": "kalyani@gmail.com",
  "company": "ABC Pvt Ltd",
  "message": "Interested in AI Automation"
}
```

---

## How to Run the Project

1. Clone the repository.
2. Open the project in Spring Tool Suite (STS).
3. Configure MySQL in `application.properties`.
4. Create the database.
5. Run the Spring Boot application.
6. Open:

```
http://localhost:8085/index.html
```

---

## Deployment

- Backend: Render
- Frontend: Vercel

---



