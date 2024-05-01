# Task Management System

A simple task management system built using Java Spring, MySQL, and Thymeleaf.

## Demo
![](/images/task-snap1.PNG)
![](/images/task-snap2.PNG)

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Configuration](#configuration)
  - [Running the Application](#running-the-application)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Introduction
The Task Management System is a web application that allows users to create, view, edit, and delete tasks. It provides a simple and intuitive interface for managing tasks, making it easier to stay organized and on top of your work.

## Features
- Create new tasks with a title and description
- Mark tasks as completed or incomplete
- Edit existing tasks
- Delete tasks
- View a list of all tasks

## Technologies Used
- Java Spring Boot
- MySQL
- Thymeleaf
- Maven or Gradle

## Getting Started

### Prerequisites
- Java 11 or higher
- MySQL server
- Maven or Gradle

### Installation
1. Clone the repository:
   ```
   git clone https://github.com/ArjunAranetaCodes/Java-Spring-MySQL-ThymeLeaf-Task-Management.git
   ```
2. Navigate to the project directory:
   ```
   cd Java-Spring-MySQL-ThymeLeaf-Task-Management
   ```

### Configuration
1. Open the `application.properties` (or `application.yml`) file and update the following properties:
   ```
	spring.application.name=thymeleaf.task

	spring.datasource.url=jdbc:mysql://localhost:3306/task_management
	spring.datasource.username=username
	spring.datasource.password=password
	spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
	spring.datasource.hikari.*
   ```
2. (Optional) If you want to use a different database, update the `spring.datasource.url` property accordingly.

### Running the Application
1. If you're using Maven, run the following command:
   ```
   ./mvnw spring-boot:run
   ```
2. If you're using Gradle, run the following command:
   ```
   ./gradlew bootRun
   ```

## Usage
1. Open your web browser and navigate to `http://localhost:8080/`.
2. You will see the task list page, where you can view, create, edit, and delete tasks.
3. To create a new task, click the "Create Task" button.
4. To edit an existing task, click the "Edit" link next to the task you want to modify.
5. To delete a task, click the "Delete" link next to the task you want to remove.

## Contributing
Contributions are welcome! If you find any issues or have suggestions for improvements, please feel free to open an issue or submit a pull request.

## License
This project is licensed under the [MIT License](LICENSE).