# AD Tech Enterprises Website

## Project Overview

This project is a responsive company website developed for **AD Tech Enterprises Pvt. Ltd.** It provides information about the company and its services through a modern user interface. Users can submit their queries using the Contact Us form. The frontend communicates with a Spring Boot REST API, and the submitted data is stored in a MySQL database.

---

## Features

- Responsive Landing Page
- Home, About, Services and Contact Sections
- Contact Form
- REST API Integration
- MySQL Database Integration
- Swagger API Documentation
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
- Spring Web

### Database
- MySQL (Railway)

### API Documentation
- Swagger OpenAPI

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
├── index.html
├── style.css
├── script.js
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

### Successful Response

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

## API Documentation

Swagger UI

```
https://ad-tech-enterprises-2.onrender.com/swagger-ui/index.html
```

---

## Deployment

### Frontend
- Vercel

### Backend
- Render

### Database
- Railway MySQL

---

## How to Run the Project

1. Clone the repository.

```bash
git clone <repository-url>
```

2. Open the project in Spring Tool Suite (STS).

3. Configure MySQL database credentials in `application.properties`.

4. Run the Spring Boot application.

5. Open the frontend or deploy it to Vercel.

6. Test the backend APIs using Swagger UI or Postman.

---

## Live Project

### Frontend (Vercel)

```
https://ad-tech-frontend-dt9c.vercel.app/
```

### Backend (Render)

```
https://ad-tech-enterprises-2.onrender.com/
```

### Swagger UI

```
https://ad-tech-enterprises-2.onrender.com/swagger-ui/index.html
```

---

