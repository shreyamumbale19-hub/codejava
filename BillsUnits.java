import java.util.Scanner;
public class BillsUnits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int units;
    double bill;

    System.out.print("Enter the units: ");
    units = sc.nextInt();
    if (units <= 100) {
      bill = units * 2;
    } else if (units <= 200) {
      bill = 100 * 3 ;
    } else if (units <= 300) {
      bill = 100 * 5;
    }else{
      bill = 100 * 7;
    }
    System.out.println("The electricity bill is:₹ " + bill);
  }
}
