import java.util.Scanner;
public class basiccalculator{
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  int number1;
  int number2;

  System.out.print("Enter first number:");
  number1 = sc.nextInt ();
  System.out.print("Enter second number:");
  number2 = sc.nextInt ();  

  System.out.println("Addition of two numbers is:" + (number1 + number2));
  System.out.println("Subtraction of two numbers is:" + (number1 - number2));
  System.out.println("Multiplication of two numbers is:" + (number1 * number2));
  System.out.println("Division of two numbers is:" + (number1 / number2));
  System.out.println("Modulus of two numbers is:" + (number1 % number2));
 }
}