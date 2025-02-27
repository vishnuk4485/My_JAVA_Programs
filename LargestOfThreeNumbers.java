import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args){

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Enter The First Number");
        double firstNumber = scanner1.nextDouble();

        System.out.println("Enter The Second Number");
        double secondNumber = scanner1.nextDouble();

        System.out.println("Enter The Third Number");
        double thirdNumber = scanner1.nextDouble();

        double largest;

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            largest = firstNumber;
        }
        else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            largest = secondNumber;
        }
        else {
            largest = thirdNumber;
        }

        System.out.println("The largest number is: " + largest);

        scanner1.close();
    }
}
