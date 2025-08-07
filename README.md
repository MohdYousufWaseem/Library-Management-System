
# Library Management System (Java - OOP Project)

A simple console-based Library Management System developed in Java using Object-Oriented Programming principles. 
This project allows the management of books and users, and supports issuing and returning books.

---

## Features

### Book Management
- Add new books
- Update existing book details
- Delete books
- Search books by title
- Display all books

### User Management
- Register new users
- Update user information
- Delete users
- Display all registered users

### Book Issuing & Returning
- Issue books to users
- Return books
- Tracks which books each user owns

---

## 🛠Technologies Used
- Java (JDK 17+)
- VS Code / Any Java IDE
- Terminal / Console

---

##  Project Structure

```
📁 LibraryManagementSystem
├── 📄 Main.java              // Entry point of the program
├── 📄 Book.java              // Book entity
├── 📄 User.java              // User entity
├── 📄 BookService.java       // Book-related operations
├── 📄 UserService.java       // User-related operations
├── 📄 LibraryService.java    // Issue and return logic
```

---

##  How to Run

1. **Clone the repository**:
   ```bash
   git clone https://github.com/MohdYousufWaseem/Library-Management-System.git
   cd Library-Management-System
   ```

2. **Compile the code**:
   ```bash
   javac *.java
   ```

3. **Run the program**:
   ```bash
   java Main
   ```

4. Follow the on-screen menu to interact with the system.

---

## Sample Use Cases

```plaintext
1. Add a Book
2. Register a User
3. Issue a Book
4. Return a Book
5. Search Book by Title
6. Delete a User
7. Display all Books or Users
```

---

##  Notes
- Ensure Java is installed and properly configured in your system (`java -version`).
- Input validations are minimal, intended for educational/demo purposes.
- This project is console-based and uses `Scanner` for input.

---

##  Author

**Mohd Yousuf Waseem**  
[GitHub](https://github.com/MohdYousufWaseem)  
Java OOPs Practice
