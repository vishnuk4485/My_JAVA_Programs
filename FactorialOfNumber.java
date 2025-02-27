import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {

        int n, fact = 1;

        Scanner scanner6 = new Scanner(System.in);
        System.out.print("Enter the Number: ");

        n = scanner6.nextInt();

        for(int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
    }
}