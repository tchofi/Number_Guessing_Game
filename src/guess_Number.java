import java.util.Scanner;



public class guess_Number {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 101);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number between 0 and 100");
        int guess = scanner.nextInt();


        int counter = 0;
        while (counter < 6 && guess != number) {
            counter++;

            if (guess > number) {
                System.out.println("Your guess is too high");
            } else {
                System.out.println("Your guess is too low");
            }

            if (counter < 6) {
                System.out.println("You have " + (6 - counter) + " guess(es) left");
                guess = scanner.nextInt();
            }

        }

        if (guess == number) {
            System.out.println("Congratulations! You guessed the number in " + (counter + 1) + " guess(es)");
        }
        else {
            System.out.println("Game Over! The number was: " + number);
        }
    }
}