# TODOS App

An early-stage to-do list web application built with Spring Boot MVC and JSP views, used to practice controllers, services, view resolution and session attributes.

## Tech Stack

- Java 17, Spring Boot 3.2 (milestone)
- Spring MVC with JSP views (embedded Tomcat Jasper, JSTL)

## Features

- `GET /list-todos` renders the to-do list page (`listTodos.jsp`) from an in-memory `TodoService`
- JSP views for login, welcome and the to-do list

This project is a work in progress: there is no persistence yet (to-dos live in an in-memory list that starts empty), and the login controller is not wired up.

## Getting Started

### Prerequisites

- JDK 17

No database is required. The project uses a Spring Boot milestone release, which is downloaded from the Spring milestone repository configured in `pom.xml`.

### Run

```bash
git clone https://github.com/Hussein-Fouani/TODOSAPP.git
cd TODOSAPP
./mvnw spring-boot:run
```

Then open `http://localhost:8080/list-todos`.

## Project Structure

```
src/main/java/com/example/todosapp/   Application, Todo model, TodoService, TodoController
src/main/resources/META-INF/resources/WEB-INF/JSP/   JSP views
src/main/resources/application.properties            View prefix/suffix
```
