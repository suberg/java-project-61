package hexlet.code;

public class Engine {
    public static boolean getFeedback(String rightAnswer, String currentAnswer, String userName) {
        boolean isUserAnsweredCorrectly = rightAnswer.equals(currentAnswer.trim());

        System.out.println("Your answer: " + currentAnswer);
        if (isUserAnsweredCorrectly) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + currentAnswer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'.");
            System.out.println("Let's try again, " + userName + "!");
        }

        return isUserAnsweredCorrectly;
    }

    public static void congratulateUser(String userName) {
        System.out.println("Congratulations, " + userName + "!");
    }
}
