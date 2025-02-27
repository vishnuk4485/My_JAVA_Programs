import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args){

        int n, rem, res=0, temp;

        System.out.println("Enter The Value");
        Scanner scanner15 = new Scanner(System.in);
        n = scanner15.nextInt();

        temp=n;

        while(n>0)
        {
            rem = n%10;
            res = (rem*rem*rem) + res;
            n = n/10;
        }
        if(temp == res){
            System.out.println("The Given Number Is Armstrong Number");
        }
        else
        {
            System.out.println("The Given Number Is Not A Armstrong Number");
        }
    }
}
