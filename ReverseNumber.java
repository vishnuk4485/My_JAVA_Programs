import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){

        Scanner scanner11 = new Scanner(System.in);

        System.out.println("Enter The Number");
        int num = scanner11.nextInt();

        int rev = 0;
        int rem;

        while(num > 0){
            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }
        System.out.println("The Reverse Of given num is:" + rev);
    }
}
