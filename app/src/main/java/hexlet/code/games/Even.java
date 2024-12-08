package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class Even {
    public static void game() {
        String userName = Cli.greeting();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        System.out.println("Question: 15");
        boolean isFirstAnswerCorrect = Engine.getFeedback("no", scanner.next(), userName);
        if (!isFirstAnswerCorrect) return;

        System.out.println("Question: 6");
        boolean isSecondAnswerCorrect = Engine.getFeedback("yes", scanner.next(), userName);
        if (!isSecondAnswerCorrect) return;

        System.out.println("Question: 7");
        boolean isThirdAnswerCorrect = Engine.getFeedback("no", scanner.next(), userName);
        if (!isThirdAnswerCorrect) return;

        Engine.congratulateUser(userName);
    }
}
