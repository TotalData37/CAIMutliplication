# Computer-Assisted Instruction: Multiplication Practice

This Java program provides **computer-assisted instruction (CAI)** for practicing multiplication. The application randomly generates two single-digit integers and repeatedly prompts the user until the correct answer is provided. It gives **instant feedback** for each attempt.

> **Course**: CSIS 212-B02  
> **Author**: David Lyman  
> **Assignment**: 4  
> **Citation**: [Oracle Random Class](https://docs.oracle.com/javase/8/docs/api/java/util/Random.html)

---

## 📁 Project Structure
CAIMultiplication/
├── CAIMultiplication.java // Main class handling question generation and input
├── CAIMultiplication.class // Compiled Java class
├── .gitattributes
└── README.md // Project documentation

---

## 💡 Features

- Randomly generates two **single-digit numbers (1–9)**
- Prompts the user with multiplication questions
- Repeats the same question until the correct answer is entered
- Displays feedback:
  - ✅ `"Very Good!"` for correct answers
  - ❌ `"No. Please try again."` for incorrect answers
- Runs continuously for unlimited practice

---

## 🛠️ Getting Started

### ✅ Prerequisites

- Java Development Kit (JDK) 8 or later
- Terminal or IDE (e.g. IntelliJ, Eclipse)

### 📦 How to Run

1. Clone or download the project files.
2. Make sure the file is inside a folder named `caimultiplication/` to match the package.
3. Compile the program:

   ```bash
   javac CAIMultiplication.java
4. Run the program:

   ```bash
   java caimultiplication.CAIMultiplication

---

📄 Sample Output

How much is 3 times 7? 21
Very Good!
David Lyman – Assignment 4

How much is 5 times 4? 18
No. Please try again.
How much is 5 times 4? 20
Very Good!
David Lyman – Assignment 4

---

🧠 Concepts Demonstrated
Methods: askQuestion() encapsulates the question prompt logic

Loops: do-while loop ensures repeated prompting until the correct answer

Random number generation: Uses Random class to create new problems

User input validation: Ensures learning by requiring correct answers

Immediate feedback: Encourages learning reinforcement

---

📜 License
This project is for academic and instructional purposes only and not licensed for production or distribution.
