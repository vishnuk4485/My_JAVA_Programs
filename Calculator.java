import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){

      Scanner scanner8 = new Scanner(System.in);
      System.out.println("Enter The 1st Value");
      int a = scanner8.nextInt();

      System.out.println("Enter The 2nd Value");
      int b = scanner8.nextInt();

      System.out.println("Select Operation");
      System.out.println("Addition-A: Subtraction-S Multiplication-M Division-D");

      char ch = scanner8.next().charAt(0);
      switch (ch){
          case 'A':
              System.out.println("Sum Of The Given Two Numbers:" + (a+b));
              break;
          case 'S':
              System.out.println("Subtraction Of The Given Two Numbers:" + (a-b));
              break;
          case 'M':
              System.out.println("Multiplication Of The Given Two Numbers:" + (a*b));
              break;
          case 'D':
              System.out.println("Division Of The Given Numbers:" + (a/b));
              break;
              default:
          System.out.println("Invalid Choice");
      }
    }
}
