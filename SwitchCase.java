import java.util.Scanner;

public class SwitchCase {
public static void main(String[] args) {

Scanner scanner7 = new Scanner(System.in);

System.out.println("Enter a Day:");
int day = scanner7.nextInt();

switch (day) {
case 1:
System.out.println("Monday");
break;
case 2:
System.out.println("Tuesday");
break;
case 3:
System.out.println("Wednesday");
break;
case 4:
System.out.println("Thursday");
break;
case 5:
System.out.println("Friday");
break;
case 6:
System.out.println("Saturday");
break;
case 7:
System.out.println("Sunday");
break;
default:
System.out.println("You Have Entered The Wrong Day Please Choose The Right Day");
}
scanner7.close();
}
}