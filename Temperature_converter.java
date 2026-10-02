import java.util.Scanner;
public class Temperature_converter{
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  int celsius;
  double fahrenheit;

  System.out.print("Enter temperature in Celsius:");
  celsius = sc.nextInt();

  fahrenheit = (celsius * 9/5) + 32;

  System.out.println("Temperature in Fahrenheit is:" + fahrenheit);

}
}