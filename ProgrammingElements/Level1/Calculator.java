import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for two floating point numbers
        System.out.print("Enter first number: ");
        float number1 = scanner.nextFloat();

        System.out.print("Enter second number: ");
        float number2 = scanner.nextFloat();

        // Perform arithmetic operations
        float addition = number1 + number2;
        float subtraction = number1 - number2;
        float multiplication = number1 * number2;
        float division = number2 != 0 ? number1 / number2 : Float.NaN;

        
        // Print the results
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " 
            + number1 + " and " + number2 + " is " 
            + addition + ", " + subtraction + ", " + multiplication + ", and " + division);

        scanner.close();
    }
}