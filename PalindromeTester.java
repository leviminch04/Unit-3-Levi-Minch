import java.util.Scanner;

public class PalindromeTester {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Would you like to enter a palindrome (y/n)");
    String yn = scan.next();
    String yes = "y";
    String no = "n";
    boolean running = true;
    while (yn.equals(yes)){
      System.out.println("What is your string?");
      String palindrome = scan.next();
      String palindromeLower = palindrome.toLowerCase();
    }
    if (yn.equals(no)){
      System.out.println("Ok Then");

    }

  }
}
