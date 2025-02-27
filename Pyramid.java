import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args){

        int i, j, n;
        Scanner scanner5 = new Scanner(System.in);

        System.out.println("Enter The Number");
        n = scanner5.nextInt();

        for (i=1; i<=n; i++)
        {
            for (j=1; j<=i; j++)
            {
                System.out.println("*\n");
            }
            System.out.println();
        }
    }
}
