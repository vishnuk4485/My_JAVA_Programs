import java.util.Scanner;

public class SwapThreeNumbers {
    public static void main(String[] args){

        Scanner scanner10 = new Scanner(System.in);

        System.out.println("Enter 1st Number");
        int num1 = scanner10.nextInt();

        System.out.println("Enter 2nd Number");
        int num2 = scanner10.nextInt();

        System.out.println("Enter 3rd Number");
        int num3 = scanner10.nextInt();

        System.out.println("Before Swapping: num1 = " + num1 + ", num2 = " + num2 + ", num3 = " + num3);

      num3 = num1;
      num1 = num2;
      num2 = num3;

      System.out.println("After Swapping: num1 = " + num1 + ", num2 = " + num2 + ", num3 = " + num3);

      scanner10.close();
    }
}
