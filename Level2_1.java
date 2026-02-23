import java.util.Scanner;
public class Level2_1 {
     public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the first number: "); 
        float number1 = scanner.nextFloat(); 
        System.out.print("Enter the second number: "); 
        float number2 = scanner.nextFloat(); 
        float addition = number1 + number2; 
        float subtraction = number1 - number2; 
        float multiplication = number1 * number2; 
        String division = (number2 != 0) ? String.valueOf(number1 / 
number2) : "Undefined (division by zero)"; 
        System.out.println("The addition, subtraction, multiplication, and division value of " + number1 + " and " + number2 + 
                " is " + addition + ", " + subtraction + ", " + 
multiplication + ", and " + division + "."); 
 
       scanner.close(); 
    }
}
