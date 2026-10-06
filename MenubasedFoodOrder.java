import java. util.Scanner;
public class MenubasedFoodOrder {
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    int choice;
    System.out.println("-----Menu-----");
    System.out.println("1. Pizza");
    System.out.println("2. Burger");
    System.out.println("3. Pasta");
    System.out.println("4. Coffee");
    System.out.print("Enter your choice: ");
    choice = sc.nextInt();
    switch(choice){
      case 1:
        System.out.println("You have Selected: Pizza.");
        break;
      case 2:
        System.out.println("You have Selected: Burger.");
        break;
      case 3:
        System.out.println("You have Selected: Pasta.");
        break;
      default:
        System.out.println("Invalid choice. Please select a valid option from the menu.");
    }

  }
}