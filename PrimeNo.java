import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args){

        int n, i, count=0;

        Scanner scanner12 = new Scanner(System.in);
        System.out.println("Enter The Value");
        n = scanner12.nextInt();

        for (i=1; i<=n; i++){
            if (n%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println("The Given Number is a Prime No.");
        }
        else{
            System.out.println("The Given Number is not a Prime No.");
        }
    }
}
