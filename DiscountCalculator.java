import java .util. Scanner;
public class DiscountCalculator{
  public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);
    double OriginalPrice;
    double DiscountAmount;
    double FinalPrice;

    System.out.print("Enter original price: ");
    originalPrice = scanner.nextDouble();

    System.out.print("Enter discount percentage: ");
    discountPercentage = scanner.nextDouble();

    discountedPrice = (originalPrice * (discountPercentage / 100));
    
    FinalPrice = originalPrice -discount;
    System.out.println("Discount  amount:"+ Discount );
    System .out.println("final price:" + final);
  }

}