import java.util.Scanner;

public class RockPaperScissors {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Rock paper scissors simulater, which do you choose? ");
    String choice = scan.next();
    int numRand = (int) ((Math.random * 2) + 1);
    String rand;
    if (numRand == 1) {
      rand = "rock";
    }
    if (numRand == 2) {
      rand = "paper";
    }
    if (numRand == 3) {
      rand = "scissors";
    }
  }
}
