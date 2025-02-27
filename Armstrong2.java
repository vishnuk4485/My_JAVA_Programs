import java.util.Scanner;

public class Armstrong2 {
    public static void main(String[] args) {

        int a, b, num, sum, rem;

        Scanner scanner16 = new Scanner(System.in);
        System.out.println("Enter The Values of a and b");
        a = scanner16.nextInt();
        b = scanner16.nextInt();

        for (int i=a; i<=b; i++){
            num = i;
            sum = 0;

            while(num > 0){
                rem = num % 10;
                sum = (rem*rem*rem) + sum;
                num = num / 10;
            }

            if (sum == i){
                System.out.println(sum);
            }
        }
    }
}