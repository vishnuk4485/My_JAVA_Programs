import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args){

        Scanner scanner9 = new Scanner(System.in);

        System.out.println("Enter 1st Number");
        int Num1 = scanner9.nextInt();

        System.out.println("Enter 2nd Number");
        int Num2 = scanner9.nextInt();

        System.out.println("Before Swapping: num1 = " + Num1 + ", num2 = " + Num2);

       Num1 = Num1 + Num2;
       Num2 = Num1 - Num2;
       Num1 = Num1 - Num2;

        System.out.println("After Swapping: num1 = " + Num1 + ", num2 = " + Num2);
        scanner9.close();
    }
}
