import java .util. Scanner;
public class ElectricityBill {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    double units;
    double costperunit;
    double totalbill;

    System.out.print("Enter units: ");
    units = scanner.nextDouble();
    System.out.print("Enter cost per unit: ");
    costperunit = scanner.nextDouble();
    totalbill = units * costperunit;
    System.out.println("Total bill: " + totalbill);
    
  }
}