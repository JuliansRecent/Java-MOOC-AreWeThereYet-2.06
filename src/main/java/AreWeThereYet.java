
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a while loop set to true
        while(true) {
            // Prompt the user for an input
            System.out.println("Give a number:");

            // Store the variable in the int val
            int val = Integer.valueOf(scanner.nextLine());

            // Break the loop if the value is equal to 4
            if(val == 4) {
                break;
            }
        }


    }
}
