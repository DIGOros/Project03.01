import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter any number from 1 to 10:");
        int number = in.nextInt();

        // Using if/else statements and relational operators
        if (number >= 1 && number <= 10) {
            System.out.println("Valid input.");
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 10.");
            return; // Exit the program if input is invalid
        }

        // Using nested if/else conditionals and logical operators
        if (number != 5) {
            System.out.println("Number is not equal to 5.");
            if (number > 5) {
                System.out.println("Number is greater than 5.");
            } else {
                System.out.println("Number is less than 5.");
            }
        } else {
            System.out.println("Number is equal to 5.");
        }

        // Using switch statement
        switch (number) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Number is between 1 and 4.");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Number is between 6 and 10.");
                break;
            default:
                System.out.println("Unexpected number.");
        }

        // Using String comparison with equals() method
        in.nextLine(); // Consume the newline character left by nextInt()
        System.out.println("Enter a word:");
        String word = in.nextLine();
        String targetWord = "hello";

        if (word.equals(targetWord)) {
            System.out.println("You entered 'hello'.");
        } else {
            System.out.println("You did not enter 'hello'.");
        }
    }
}
