import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String Name;
    int Age;
    double CGPA;
     System.out.print("Enter name:");
    Name = sc.nextLine ();
   

    System.out.print("Enter age:");
    Age = sc.nextInt ();

    System.out.print("Enter cgpa:");
    CGPA = sc.nextDouble ();
    
  }
}