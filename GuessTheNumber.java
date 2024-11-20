import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lb = 1;
        int ub = 100;
        int maxAttempts = 10;
        int score = 0;
        int round = 1;

        System.out.println("=====*****************************Welcome to Guess the Number Game!************************=====");

        while (true) {
            System.out.println("\nRound " + round);

            int rndmNo= random.nextInt(ub - lb + 1) + lb;
            int attempts = 0;

            while (attempts < maxAttempts) {
                System.out.print("Guess a number in the between of " + lb + " and " + ub + ": ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == rndmNo) {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    score += maxAttempts - attempts + 1; // Award points based on attempts
                    break;
                } else if (guess < rndmNo) {
                    System.out.println("It is Too low, Please Try again.");
                } else {
                    System.out.println("It is Too high, Please Try again.");
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("You have reached the maximum number of attempts. The number was " + rndmNo);
            }

            round++;

            System.out.print("Do you want to play  more round? yes (y) or no (n): ");
            String plyagn = scanner.next();
            if (!plyagn.equalsIgnoreCase("y")) {
                break;
            }
        }

        System.out.println("\nGame is Finished. Your Total score is " + score);
        System.out.println("                                                                                           ");
        
        System.out.println("=====*****************************Thank You, Have a Nice Day ************************=====");  
        System.out.println("                                                                                            ");
        System.out.println("                        ====================**********=================                     ");
        
        
        scanner.close();
    }
}