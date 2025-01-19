# Student Management System

A console-based application in Java to manage student records. The system allows adding, updating, viewing, and removing student data efficiently using a `HashMap`.

---

## Features

- **Add Student**: Add new student records with unique IDs.
- **Update Student**: Modify existing student details like name, age, or course.
- **Remove Student**: Delete student records using their unique ID.
- **View Student**: Retrieve and display the details of a specific student.

---

## Menu Options

When the application is run, the following menu appears:

- Add Student
- Update Student
- Remove Student
- View Student
- Exit
- **Enter your choice:**


### Options Description

1. **Add Student**:  
   - Prompt to enter the student’s ID, name, age, and course.  
   - Ensures no duplicate IDs exist.  
   - Displays a success message after successful addition.

2. **Update Student**:  
   - Allows updating the name, age, or course of an existing student.  
   - Fields can be left unchanged by leaving the input blank or entering `-1` for age.

3. **Remove Student**:  
   - Deletes a student record using their unique ID.  
   - Displays an error message if the ID does not exist.

4. **View Student**:  
   - Displays details of a student for the given ID.  
   - Returns an error if the student ID is not found.

5. **Exit**:  
   - Closes the application.

---

## Getting Started

### Prerequisites

Ensure you have the following installed:
- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk-downloads.html)

### Installation

1. Clone or download this repository:
   ```bash
   git clone https://github.com/KunalKC586/Student-Management-System.git
2. Navigate to the project directory:
     ```bash
     cd <repository-folder>
  
3. Open the project in your preferred Java IDE or text editor.

### Running the program

1. Compile the program:
   ```bash
   javac StudentManagementSystem.java
2. Run the program:
   ```bash
   java StudentManagementSystem
---
## Error Handling

The application includes key error-handling mechanisms:

1. **Duplicate Student ID**: Ensures no two students share the same ID and provides an error message:

2. **Invalid Input**: Validates user inputs (e.g., numeric age) and prompts for corrections in case of errors.

3. **Non-Existent Students**: Displays a clear error message when attempting to update, view, or remove a non-existent student:


---

## Future Enhancements

Here are three main ideas for future development:

1. **Data Persistence**: Add functionality to save student records to a file or database for long-term storage.

2. **Search Functionality**: Enable users to search for students by name, course, or other attributes.

3. **Graphical User Interface (GUI)**: Create a user-friendly interface for better interaction and usability.

---
