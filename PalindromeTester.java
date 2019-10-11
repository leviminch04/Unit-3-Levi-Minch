import java.util.Scanner;

public class PalindromeTester {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean run = true;
    boolean running = true;
    while(run){
      System.out.println("Would you like to enter a palindrome (y/n)");
      String yn = scan.next();
      String yes = "y";
      String no = "n";
      run = false;
      running = true;
      while(running){
        while (yn.equals(yes) && running == true){
          System.out.println("What is your palindrome?");
          String palindrome = scan.next();
          String palindromeLower = palindrome.toLowerCase();
          char[] palindromArray = palindromeLower.toCharArray();
          String reversed = new StringBuilder(new String(palindromArray)).reverse().toString();
          if (reversed.equals(palindrome)){
            System.out.println("Your string: " + palindrome + " is a palindrome");
            running = false;
            run = true;
          }
          if (reversed.equals(palindrome) == false){
            System.out.println("Your string: " + palindrome + " is not a palindrome");
            running = false;
            run = true;
          }

        }
        if (yn.equals(no)){
          System.out.println("Ok Then");
          running = false;
        }
      }
    }



  }
}
