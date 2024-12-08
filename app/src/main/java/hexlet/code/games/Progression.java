package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Progression {
    private static String generateProgression() {
        int oneHundred = 100;
        int numbersCount = 10;
        int step = 1 + (int) (Math.random() * numbersCount);
        int startNumber = (int) (Math.random() * oneHundred);
        int hiddenNumberIndex = (int) (Math.random() * numbersCount);
        List<Integer> allNumbers = new ArrayList<>();

        System.out.print("Question: ");

        for (int i = 0; i < numbersCount; i++) {
            int itemToAdd = startNumber + (step * i);
            allNumbers.add(itemToAdd);

            System.out.print(hiddenNumberIndex == i ? ".. " : itemToAdd + " ");
        }

        System.out.println();

        return allNumbers.get(hiddenNumberIndex) + "";
    }

    public static void game() {
        String userName = Cli.greeting();

        Scanner scanner = new Scanner(System.in);

        System.out.println("What number is missing in the progression?");

        String firstExerciseAnswer = generateProgression();
        boolean isFirstAnswerCorrect = Engine.getFeedback(firstExerciseAnswer, scanner.next(), userName);
        if (!isFirstAnswerCorrect) {
            return;
        }

        String secondExerciseAnswer = generateProgression();
        boolean isSecondAnswerCorrect = Engine.getFeedback(secondExerciseAnswer, scanner.next(), userName);
        if (!isSecondAnswerCorrect) {
            return;
        }

        String thirdExerciseAnswer = generateProgression();
        boolean isThirdAnswerCorrect = Engine.getFeedback(thirdExerciseAnswer, scanner.next(), userName);
        if (!isThirdAnswerCorrect) {
            return;
        }

        Engine.congratulateUser(userName);
    }
}
