package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class Calc {
    private enum OPERATIONS {
        SUM,
        DIFFERENCE,
        MULTIPLICATION
    }

    private static String generateExpression() {
        int operationsCount = OPERATIONS.values().length;
        OPERATIONS currentOperation = OPERATIONS.values()[(int) (Math.random() * operationsCount)];
        int firstNumber = (int) (Math.random() * 100);
        int secondNumber = (int) (Math.random() * 100);

        int answer = 0;

        if (currentOperation.equals(OPERATIONS.SUM)) {
            System.out.println("Question: " + firstNumber + " + " + secondNumber);
            answer = firstNumber + secondNumber;
        }
        else if (currentOperation.equals(OPERATIONS.DIFFERENCE)) {
            System.out.println("Question: " + firstNumber + " - " + secondNumber);
            answer = firstNumber - secondNumber;
        }
        else if (currentOperation.equals(OPERATIONS.MULTIPLICATION)) {
            System.out.println("Question: " + firstNumber + " * " + secondNumber);
            answer = firstNumber * secondNumber;
        }

        return answer + "";
    }

    public static void game() {
        String userName = Cli.greeting();

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the result of the expression?");

        String firstExpressionAnswer = generateExpression();
        boolean isFirstAnswerCorrect = Engine.getFeedback(firstExpressionAnswer, scanner.next(), userName);
        if (!isFirstAnswerCorrect) return;

        String secondExpressionAnswer = generateExpression();
        boolean isSecondAnswerCorrect = Engine.getFeedback(secondExpressionAnswer, scanner.next(), userName);
        if (!isSecondAnswerCorrect) return;

        String thirdExpressionAnswer = generateExpression();
        boolean isThirdAnswerCorrect = Engine.getFeedback(thirdExpressionAnswer, scanner.next(), userName);
        if (!isThirdAnswerCorrect) return;

        Engine.congratulateUser(userName);
    }
}
