import java.util.Scanner;
import java.text.DecimalFormat;

public class winPercentage {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    DecimalFormat fmt = new DecimalFormat("0.#");
    boolean running = true;
    boolean calculate = true;
    while (running){
      calculate = true;
      System.out.println("How many games did you play?");
      double totalGame = scan.nextDouble();
      System.out.println("How many games did you win?");
      double gamesWon = scan.nextDouble();
      double totalGameInt = Math.round(totalGame);
      double gamesWonInt = Math.round(gamesWon);
      if ((totalGame - totalGameInt) != 0){
        System.out.println("Total games has to be a whole number");
        calculate = false;
      }
      if ((gamesWon - gamesWonInt) != 0){
        System.out.println("Games won has to be a whole number");
        calculate = false;
      }
      if (totalGame < gamesWon){
        System.out.println("Games won must be < total games played");
        calculate = false;
      }
      if (totalGame <= 0){
        System.out.println("Total games must be greater than 0");
        calculate = false;
      }
      if (gamesWon < 0){
        System.out.println("Games won must be greater or equal to 0");
        calculate = false;
      }

      if (calculate){
        double winPercent = ((double) gamesWon / (double) totalGame) * 100;
        System.out.println("Your win percentage is: " + fmt.format(winPercent) + "%");
        running = false;
      }
      if (!calculate){
        System.out.println("Try again");
        System.out.println("-------------------------");
      }
    }
  }
}
