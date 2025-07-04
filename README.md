# Java Console Quiz App

A command-line quiz application built in Java that tests your knowledge on programming concepts and general knowledge.

## Features

- **Interactive Console Interface**: Clean and user-friendly command-line experience
- **Multiple Choice Questions**: 4 options for each question
- **Instant Feedback**: Get immediate results after each answer
- **Score Tracking**: Final score display at the end
- **Diverse Topics**: Questions covering Java, Android development, and general knowledge

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- A terminal or command prompt

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/java-quiz-app.git
   cd java-quiz-app
   ```

2. Compile the Java file:
   ```bash
   javac com/elevateLabs/QuizApp.java
   ```

3. Run the application:
   ```bash
   java com.elevateLabs.QuizApp
   ```

## How to Play

1. Run the application
2. Read each question carefully
3. Enter your answer (1-4) for each multiple-choice question
4. Get instant feedback on whether your answer is correct
5. View your final score at the end

## Sample Questions

The quiz includes questions on:
- **Programming Languages**: Android development, Java concepts
- **Geography**: World capitals
- **Technology**: Company history and development
- **Data Structures**: FIFO, LIFO concepts

## Code Structure

```
QuizApp.java
├── Question class
│   ├── questionText: String
│   ├── options: String[]
│   ├── correctOption: int
│   ├── isCorrect(int): boolean
│   └── displayQuestion(): void
└── QuizApp class
    └── main(String[]): void
```

## Adding New Questions

To add new questions, modify the `questions` list in the `main` method:

```java
questions.add(new Question("Your question here?",
        new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 
        correctOptionIndex));
```

**Note**: The `correctOptionIndex` starts from 1, not 0.

## Example Output

```
Welcome to the Java Console Quiz!
----------------------------------

Question 1:
Which language is used for Android development?
1. Python
2. Kotlin
3. Swift
4. Ruby
Your answer (1-4): 2
Correct!

Question 2:
What is the capital of France?
1. London
2. Paris
3. Berlin
4. Madrid
Your answer (1-4): 2
Correct!

...

Quiz Over! Your Score: 5/5
```
## Future Enhancements

- [ ] Add difficulty levels (Easy, Medium, Hard)
- [ ] Implement timer for each question
- [ ] Add categories for different subjects
- [ ] Save high scores to a file
- [ ] Add GUI version using JavaFX or Swing
- [ ] Support for custom question files (JSON/XML)
