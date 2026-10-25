# -From-Project-One
# Contact Service and Task Service

## Project Overview

This project was completed as part of the SNHU CS-320 Software Testing, Automation, and Quality Assurance course. The purpose of the project was to develop Java services and use JUnit testing to verify that the application met its requirements.

The project includes a Contact Service from Module Three and a Task Service from Module Four. Both services use in-memory data structures to store and manage information without requiring a database or user interface.

## Technologies Used

- Java
- JUnit 5
- Eclipse IDE
- GitHub

## Contact Service

The Contact Service manages contact information and includes the following features:

- Create contacts with unique contact IDs.
- Validate contact information.
- Update first name, last name, phone number, and address.
- Delete contacts using their contact IDs.
- Prevent invalid or duplicate contact information.

### Contact Requirements

- Contact IDs must not be null or longer than 10 characters.
- First and last names must not be null or longer than 10 characters.
- Phone numbers must contain exactly 10 digits.
- Addresses must not be null or longer than 30 characters.

## Task Service

The Task Service manages task information and includes the following features:

- Create tasks with unique task IDs.
- Validate task information.
- Update task names and descriptions.
- Delete tasks using their task IDs.
- Prevent duplicate task IDs and invalid field values.

### Task Requirements

- Task IDs must not be null or longer than 10 characters.
- Task names must not be null or longer than 20 characters.
- Task descriptions must not be null or longer than 50 characters.
- Task IDs cannot be changed after a task is created.

## Unit Testing

JUnit tests were created to verify that both services meet their requirements. The tests cover valid inputs, invalid inputs, and service operations.

Testing includes:

- Creating valid contacts and tasks.
- Rejecting null values and values that exceed the allowed lengths.
- Preventing duplicate IDs.
- Updating contact and task information.
- Deleting existing records.
- Handling attempts to update or delete records that do not exist.

Assertions such as `assertEquals()`, `assertNull()`, and `assertThrows()` are used to check expected results and verify that invalid operations are handled correctly.

## Project Structure

```text
Contact-and-Task-Service/
├── contact/
│   ├── Contact.java
│   ├── ContactService.java
│   ├── ContactTest.java
│   └── ContactServiceTest.java
├── taskservice/
│   ├── Task.java
│   ├── TaskService.java
│   ├── TaskTest.java
│   └── TaskServiceTest.java
└── README.md
```

*Note: The folder structure may vary depending on the IDE and project setup. The Java package declarations should match the actual package names in your source files.*

## What I Learned

This project helped me develop a better understanding of unit testing, software requirements, and code validation. I learned how to write JUnit tests for both successful and unsuccessful scenarios, verify expected results, and identify potential errors before software is used. I also gained experience writing Java classes and services that follow specific requirements.

## Author

SNHU CS-320 Student Project
