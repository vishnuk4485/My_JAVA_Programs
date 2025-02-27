import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String[] args){
        int a;

        Scanner scanner3 = new Scanner(System.in);

        System.out.println("Enter The Number");
        int number = scanner3.nextInt();

        for(int i=1; i<=10; i++){
            //a = i*number;
            System.out.println(i*number);
        }
    }
}
