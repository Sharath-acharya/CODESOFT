import java.util.Scanner;
import java.util.Random;

public class Numberguessinggame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random ran = new Random();
        boolean playAgain = true;
        while (playAgain) {
            int targetnum = ran.nextInt(100) + 1;
            int atempt = 0;
            int maxAttempts = 10;
            boolean correctGuess = false;
            System.out.println(" I have genarated number between  1 and 100.Try to guess it !");
            while (atempt < maxAttempts && !correctGuess) {
                System.out.println("Enter your guess:");
                int guess = scanner.nextInt();
                atempt++;
                if (guess < targetnum) {
                    System.out.println("Too low!");

                } else if (guess > targetnum) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("correct ! you have guessed the number in" + atempt + "attempts");
                    correctGuess = true;
                }

            }
            if (!correctGuess) {
                System.out.println("You have used all" + maxAttempts + "attempts.The number was:" + targetnum);

            }
            System.out.println("Do you want to play again?(yes/no):");
            String res = scanner.next();
            playAgain = res.equalsIgnoreCase("yes");

        }
        System.out.println("Thnks for palying!");
        scanner.close();

    }

}
