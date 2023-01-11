package class5;
import java.util.Scanner;
public class LogicalOrDemo {
    public static void main(String[] args) {

        System.out.println("Please enter the day");
        Scanner scan = new Scanner(System.in);
        String day = scan.next();






        if(day.equalsIgnoreCase("Monday") ||day.equals("Friday")){
            System.out.println("No class today");
        }else if (day.equalsIgnoreCase("Saturday")||day.equalsIgnoreCase("Sunday")){
            System.out.println("Java class enjoy");
        }else{
            System.out.println("Wrong day entered");
        }
    }
}
