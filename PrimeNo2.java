import java.util.Scanner;

public class PrimeNo2 {
    public static void main(String[] args){

        int i, n, temp=0;

        Scanner scanner14 = new Scanner(System.in);
        System.out.println("Enter The Value");
        n = scanner14.nextInt();

        for(i=1; i<=n; i++){

            for (int j=2; j<=i-1; j++){
                if(i % j == 0){
                    temp = temp+1;
                }
            }
            if (temp==0){
                System.out.println(i);
            }
            else {
                temp = 0;
            }
        }
    }
}
