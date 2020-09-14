import java.util.Scanner;

/**
 * A program that will ask the user for a temperature in degrees Celsius and convert it into degrees Fahrenheit.
 * @author Rose
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //Creates a Scanner used for input
    Scanner input = new Scanner(System.in);
    
    // Ask the user for the temperature they would like to convert to fahrenheit
    System.out.println("Please enter a temperature you would like to convert in degrees Celsius.");

    // Get input temperature from user
    int degreesC = input.nextInt();

    // Declare and intialize a variable using the input from the user
    int degreesF = (degreesC*9/5+32);

    // Tell the user the fahrenheit version of the temperature input
    System.out.println(degreesC + "C is the same as " + degreesF + "F");

    
  }
}
