package hexlet.code;
import java.util.Scanner;

public class Even {
    private static boolean getFeedback(String rightAnswer, String currentAnswer, String userName) {
        boolean isUserAnsweredCorrectly = rightAnswer.equals(currentAnswer);

        System.out.println("Your answer: " + currentAnswer);
        if (isUserAnsweredCorrectly) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + currentAnswer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'.");
            System.out.println("Let's try again, " + userName + "!");
        }

        return isUserAnsweredCorrectly;
    }

    public static void game() {
        String userName = Cli.greeting();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        System.out.println("Question: 15");
        boolean isFirstAnswerCorrect = getFeedback("no", scanner.next(), userName);
        if (!isFirstAnswerCorrect) return;

        System.out.println("Question: 6");
        boolean isSecondAnswerCorrect = getFeedback("yes", scanner.next(), userName);
        if (!isSecondAnswerCorrect) return;

        System.out.println("Question: 7");
        boolean isThirdAnswerCorrect = getFeedback("no", scanner.next(), userName);
        if (!isThirdAnswerCorrect) return;

        System.out.println("Congratulations, " + userName + "!");
    }
}
