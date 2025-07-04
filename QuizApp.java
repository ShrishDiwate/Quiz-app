package com.elevateLabs;

import java.util.*;

class Question {
    String questionText;
    String[] options;
    int correctOption; // index starts from 1

    public Question(String questionText, String[] options, int correctOption) {
        this.questionText = questionText;
        this.options = options;
        this.correctOption = correctOption;
    }

    public boolean isCorrect(int userAnswer) {
        return userAnswer == correctOption;
    }

    public void displayQuestion() {
        System.out.println(questionText);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }
}

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Question> questions = new ArrayList<>();

        questions.add(new Question("Which language is used for Android development?",
                new String[]{"Python", "Kotlin", "Swift", "Ruby"}, 2));
        questions.add(new Question("What is the capital of France?",
                new String[]{"London", "Paris", "Berlin", "Madrid"}, 2));
        questions.add(new Question("Which company developed Java?",
                new String[]{"Microsoft", "Apple", "Sun Microsystems", "Google"}, 3));
        questions.add(new Question("Which keyword is used to inherit a class in Java?",
                new String[]{"this", "super", "extends", "implements"}, 3));
        questions.add(new Question("Which data structure uses FIFO order?",
                new String[]{"Stack", "Queue", "Array", "LinkedList"}, 2));

        int score = 0;

        System.out.println("Welcome to the Java Console Quiz!");
        System.out.println("----------------------------------");

        for (int i = 0; i < questions.size(); i++) {
            System.out.println("\nQuestion " + (i + 1) + ":");
            Question q = questions.get(i);
            q.displayQuestion();
            System.out.print("Your answer (1-4): ");
            int answer = scanner.nextInt();

            if (q.isCorrect(answer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer: " + q.correctOption);
            }
        }

        System.out.println("\nQuiz Over! Your Score: " + score + "/" + questions.size());
        scanner.close();
    }
}
