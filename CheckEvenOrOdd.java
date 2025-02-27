import java.util.Scanner;

public class CheckEvenOrOdd {
    public static void main(String[] args){

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Enter The Number");
         double number = scanner2.nextDouble();

         if(number % 2 == 0){
             System.out.println("It is an Even Number");
         }
         else{
             System.out.println("It is An Odd Number");
         }
    }
}
