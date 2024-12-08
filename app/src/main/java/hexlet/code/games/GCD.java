package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class GCD {
    private static Integer getGCD(int first, int second) {
        int r;
        while (second != 0) {
            r = first % second;
            first = second;
            second = r;
        }

        return first;
    }

    private static String generateExercise() {
        int oneHundred = 100;
        int firstNumber = (int) (Math.random() * oneHundred);
        int secondNumber = (int) (Math.random() * oneHundred);

        System.out.println("Question: " + firstNumber + " " + secondNumber);

        return getGCD(firstNumber, secondNumber) + "";
    }

    public static void game() {
        String userName = Cli.greeting();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Find the greatest common divisor of given numbers.");

        String firstExerciseAnswer = generateExercise();
        boolean isFirstAnswerCorrect = Engine.getFeedback(firstExerciseAnswer, scanner.next(), userName);
        if (!isFirstAnswerCorrect) {
            return;
        }

        String secondExerciseAnswer = generateExercise();
        boolean isSecondAnswerCorrect = Engine.getFeedback(secondExerciseAnswer, scanner.next(), userName);
        if (!isSecondAnswerCorrect) {
            return;
        }

        String thirdExerciseAnswer = generateExercise();
        boolean isThirdAnswerCorrect = Engine.getFeedback(thirdExerciseAnswer, scanner.next(), userName);
        if (!isThirdAnswerCorrect) {
            return;
        }

        Engine.congratulateUser(userName);
    }
}
