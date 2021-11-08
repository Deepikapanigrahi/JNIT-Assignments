
import java.util.Scanner;

public class InputTypeTest {

       public static void main(String[] args) {

              Scanner obj1 = new Scanner(System.in); //creating a scanner object
              System.out.println("Enter userName");
              String userName = obj1.nextLine();  // Read user input
              
           System.out.println("Enter your Age:");
              int Age = obj1.nextInt();
              
              System.out.println("Your Bonus:");
              double bonus   = obj1.nextDouble();
              
              System.out.println("Username is: " + userName);  // Output user input
              System.out.println("Your age is: "+Age);
              System.out.println("Your bonus is: "+bonus);
              
              
                     
              
                     
       }

}


