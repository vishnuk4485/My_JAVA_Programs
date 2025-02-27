import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter UserName:");

        String username = obj.next();
        System.out.println("Username: " + username);

        Scanner obj2 = new Scanner(System.in);
        System.out.println("Enter Password:");

        String Password = obj2.next();
        System.out.println("Password: " + Password);

        System.out.println("You're Logged In");

        obj.close();
        obj2.close();
    }
}
