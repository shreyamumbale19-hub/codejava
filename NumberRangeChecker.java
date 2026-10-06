import java.util.Scanner;
public class NumberRangeChecker{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.print("Enter a number: ");
    num = sc.nextInt();
    if(num >= 1 && num <= 10){
      System.out.println("Small");
    } else if(num >= 11 && num <= 50){
      System.out.println("Medium");
    } else if (num >= 51&& num <= 100){
      System.out.println("Large");
    } else {
      System.out.println("Very Large");

    } 
    
  }
  
}