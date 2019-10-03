import java.util.Scanner;

public class DrinkDrive{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("What is your age?");
    int age = scan.nextInt();
    if (age < 17)
      System.out.println("your to young to drink and drive");
    else if (age >= 17 && age < 21)
      System.out.println("You can drive but you cant drink");
    else
      System.out.println("You can drink and drive");
  }
}
