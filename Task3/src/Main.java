import java.util.Random;
import java.util.Scanner;

public class Main {
    private static int rnd_number;
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (including both).");
        System.out.println("Can you guess what it is?...");
        makeAGuess();
    }

    private static void makeAGuess(){
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        // use hasNextDouble to check if input is numeric,
        if (scanner.hasNextDouble()) {
            int guess = scanner.nextInt();
            System.out.println("Your number is numeric");
            if (guess == rnd_number)
                System.out.print("That's correct!");
            else if (guess > rnd_number) {
                System.out.println("That's too high!");
                makeAGuess();
            }
            else if (guess < rnd_number) {
                System.out.println("That's too low!");
                makeAGuess();
            }
            else {
                makeAGuess();
            }
        }
    }
}
