import java.util.Scanner;
import java.util.Random;

class NumberGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String play = "yes";

            while (play.equals("yes")) {
            Random random = new Random();
            int ranNum = random.nextInt(100);

            int guess = -1;
            int tries = 0;

            while (guess != ranNum) {
                System.out.println("Guess a number between 1 to 100: ");
                guess = sc.nextInt();
                tries++;

                if (guess == ranNum) {
                    System.out.println("You guessed the right number");
                    System.out.println("It took " + tries + " guesses");
                    System.out.println("Play again - Yes or No: ");
                    play = sc.next().toLowerCase();
                } else if (guess > ranNum) {
                    System.out.println("Lower");
                } else {
                    System.out.println("Higher");
                }
            }
        }
        sc.close();
    }
}