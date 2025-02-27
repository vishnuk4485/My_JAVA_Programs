import java.util.Scanner;

public class LargestOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");

        double firstNumber = scanner.nextDouble();

        System.out.print("Enter the second number: ");

        double secondNumber = scanner.nextDouble();

        if (firstNumber > secondNumber) {
            System.out.println("The largest number is A: " + firstNumber);

        }
        else if (secondNumber > firstNumber) {
            System.out.println("The largest number is B: " + secondNumber);

        }
        else {
            System.out.println("Both numbers are equal.");
        }
        scanner.close();
    }
}
