import java.util.Scanner;

public class minOfThree {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("What is your first of three integers?");
    int num1 = scan.nextInt();
    System.out.println("What is your second of three integers?");
    int num2 = scan.nextInt();
    System.out.println("What is your third of three integers?");
    int num3 = scan.nextInt();
    if (num1 <= num2 && num1 <= num3)
      System.out.println("Your smallest number was: " + num1);
    else if (num2 <= num1 && num2 <= num3)
      System.out.println("Your biggest number was: " + num2);
    else if (num3 <= num1 && num3 <= num2)
      System.out.println("Your biggest number was: " + num3);
  }
}
