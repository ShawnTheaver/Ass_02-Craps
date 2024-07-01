import java.util.Random;
import java.util.Scanner;

public class Ass02_Craps {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int crapsRoll = die1 + die2;

            System.out.println("Rolling dice...");
            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);
            System.out.println("Sum: " + crapsRoll);

            if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12) {
                System.out.println("You crapped out! Do you want to play again? (y/n)");
            } else if (crapsRoll == 7 || crapsRoll == 11) {
                System.out.println("You won with a natural! Do you want to play again? (y/n)");
            } else {
                int point = crapsRoll;
                boolean gameOver = false;

                while (!gameOver) {
                    System.out.println("Point is: " + point);
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    crapsRoll = die1 + die2;

                    System.out.println("Rolling dice...");
                    System.out.println("Die 1: " + die1);
                    System.out.println("Die 2: " + die2);
                    System.out.println("Sum: " + crapsRoll);

                    if (crapsRoll == point) {
                        System.out.println("You made your point and won! Do you want to play again? (y/n)");
                        gameOver = true;
                    } else if (crapsRoll == 7) {
                        System.out.println("You got a seven and lost! Do you want to play again? (y/n)");
                        gameOver = true;
                    } else {
                        System.out.println("Trying for point... Roll again!");
                    }
                }
            }

            String response = scanner.nextLine();
            playAgain = response.equalsIgnoreCase("y");
        }
    }
}