package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    private static final int EXIT_NUMBER = 0;
    private static final int GREET_NUMBER = 1;
    private static final int EVEN_NUMBER = 2;
    private static final int CALC_NUMBER = 3;
    private static final int GCD_NUMBER = 4;
    private static final int PROGRESSION_NUMBER = 5;
    private static final int PRIME_NUMBER = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println(GREET_NUMBER + " - Greet");
        System.out.println(EVEN_NUMBER + " - Even");
        System.out.println(CALC_NUMBER + " - Calc");
        System.out.println(GCD_NUMBER + " - GCD");
        System.out.println(PROGRESSION_NUMBER + " - Progression");
        System.out.println(PRIME_NUMBER + " - Prime");
        System.out.println(EXIT_NUMBER + " - Exit");

        int userChoice = scanner.nextInt();

        System.out.println("Your choice: " + userChoice);
        System.out.println();
        System.out.println("Welcome to the Brain Games!");

        if (userChoice == GREET_NUMBER) {
            Cli.greeting();
        } else if (userChoice == EVEN_NUMBER) {
            Even.game();
        } else if (userChoice == CALC_NUMBER) {
            Calc.game();
        } else if (userChoice == GCD_NUMBER) {
            GCD.game();
        } else if (userChoice == PROGRESSION_NUMBER) {
            Progression.game();
        } else if (userChoice == PRIME_NUMBER) {
            Prime.game();
        }
    }
}
