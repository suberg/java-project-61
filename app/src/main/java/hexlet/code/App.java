package hexlet.code;
import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        int userChoice = scanner.nextInt();

        System.out.println("Your choice: " + userChoice);
        System.out.println();
        System.out.println("Welcome to the Brain Games!");

        if (userChoice == 1) {
            Cli.greeting();
        } else if (userChoice == 2) {
            Even.game();
        } else if (userChoice == 3) {
            Calc.game();
        } else if (userChoice == 4) {
            GCD.game();
        } else if (userChoice == 5) {
            Progression.game();
        } else if (userChoice == 6) {
            Prime.game();
        }
    }
}
