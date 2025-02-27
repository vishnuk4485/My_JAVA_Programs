import java.util.Scanner;

public class PalindromeNo {
    public static void main(String[] args){

        int r, sum=0, temp, n;

        Scanner scanner13 = new Scanner(System.in);
        System.out.println("Enter The Value");
        n = scanner13.nextInt();

        temp=n;
        while(n>0){
            r = n%10;
            sum = (sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("The Given Number Is Palindrome Number");
        }
        else{
            System.out.println("The Given Number Is Not a Palindrome Number");
        }
    }
}
