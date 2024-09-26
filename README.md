# adminPanel

Creating a simple Student Record Management System (SRMS) in Java requires organizing the code into a coherent structure. Below is an implementation that fulfills the requirements you've outlined.

The program includes the following features:
1. Adding new students
2. Updating student information
3. Viewing student details
4. Error handling for invalid inputs

### Student Record Management System (SRMS)

### Instructions for Running the Program

1. **Setup Java Environment**: Ensure that you have Java JDK installed on your machine. You can download it from [Oracle's website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

2. **Create Project Directory**: Create a new directory for your project.

3. **Create Source File**: Save the above code in a file named `StudentRecordManagementSystem.java`.

4. **Compile the Code**: Open a terminal/command prompt, navigate to the project directory, and run:
    ```bash
    javac StudentRecordManagementSystem.java
    ```

5. **Run the Program**: After compiling, run the program using the command:
    ```bash
    java StudentRecordManagementSystem
    ```

6. **Use the Menu**: Follow the on-screen instructions to add students, update their information, and view their details.

### Error Handling

The provided implementation includes error handling for:
- Invalid menu choices.
- Handles incorrect input types using a loop that checks if the next input is an integer.
- Notifying users if a student ID is not found when they attempt to update or view student details.

### Documentation

The code is properly documented and structured, making it easy to understand. The comments explain the purpose of each class and method, which helps in maintaining the code or extending its functionalities in the future.