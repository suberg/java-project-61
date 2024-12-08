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

    private static String generateExcercise() {
        int firstNumber = (int) (Math.random() * 100);
        int secondNumber = (int) (Math.random() * 100);

        System.out.println("Question: " + firstNumber + " " + secondNumber);

        return getGCD(firstNumber, secondNumber) + "";
    }

    public static void game() {
        String userName = Cli.greeting();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Find the greatest common divisor of given numbers.");

        String firstExcerciseAnswer = generateExcercise();
        boolean isFirstAnswerCorrect = Engine.getFeedback(firstExcerciseAnswer, scanner.next(), userName);
        if (!isFirstAnswerCorrect) return;

        String secondExcerciseAnswer = generateExcercise();
        boolean isSecondAnswerCorrect = Engine.getFeedback(secondExcerciseAnswer, scanner.next(), userName);
        if (!isSecondAnswerCorrect) return;

        String thirdExcerciseAnswer = generateExcercise();
        boolean isThirdAnswerCorrect = Engine.getFeedback(thirdExcerciseAnswer, scanner.next(), userName);
        if (!isThirdAnswerCorrect) return;

        Engine.congratulateUser(userName);
    }
}


//count = Math.min(x, y);
//
// for (int n = count; n >= 1; n--) {
//    if (x % n == 0 && y % n == 0){
//          count = n;
//          break;
//    }
// }


//int r;
//while (y != 0) {
//  r = i % y;
//  i = y;
//  y = r;
//}
//System.out.println(i);