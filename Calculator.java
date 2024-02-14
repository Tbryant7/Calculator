/*Tannon Bryant
 * 2/13/24
 * Calculator that I commit over time
*/
import java.util.Scanner;




public class Calculator{

    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in);
            System.out.println("Enter Two whole numbers.");
                double x = scan.nextDouble();
                double y = scan.nextDouble();
                    scan.nextLine();

        System.out.println("Would you like to do Addition, Substraction, Multiplication, or Divison");
            String cmd = scan.nextLine();
                double t;
        switch(cmd.toLowerCase()) {
            case "subtraction":
                t = x - y;
                System.out.println("Result:" + t);
                    break;
            case "addition":
                t = x + y;
                System.out.println("Result:" + t);
                    break;
            case "multiplication":
                t = x * y;
                System.out.println("Result:" + t);
                    break;
            case "divison":
                t = x/y; 
                System.out.println("Resuly: " + t);
                    break;

        }
    }
}