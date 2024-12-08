package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Prime {
    private static boolean isPrime(int number) {
        return number > 1
                && IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(n -> (number % n == 0));
    }

    private static String generateExercise() {
        int randomNumber = 1 + (int) (Math.random() * 100);

        System.out.println("Question: " + randomNumber);

        return isPrime(randomNumber) ? "yes" : "no";
    }

    public static void game() {
        String userName = Cli.greeting();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        String firstExerciseAnswer = generateExercise();
        boolean isFirstAnswerCorrect = Engine.getFeedback(firstExerciseAnswer, scanner.next(), userName);
        if (!isFirstAnswerCorrect) return;

        String secondExerciseAnswer = generateExercise();
        boolean isSecondAnswerCorrect = Engine.getFeedback(secondExerciseAnswer, scanner.next(), userName);
        if (!isSecondAnswerCorrect) return;

        String thirdExerciseAnswer = generateExercise();
        boolean isThirdAnswerCorrect = Engine.getFeedback(thirdExerciseAnswer, scanner.next(), userName);
        if (!isThirdAnswerCorrect) return;

        Engine.congratulateUser(userName);
    }
}
