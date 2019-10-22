import java.util.Scanner;
import java.text.DecimalFormat;

public class RockPaperScissors
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    DecimalFormat fmt = new DecimalFormat("0");
    //intitalizing variables
    String rand = "";
    String rock = "rock";
    String paper = "paper";
    String scissors = "scissors";
    String no = "no";
    String yN;
    boolean run = true;
    double wins = 0;
    double losses = 0;
    double total = 0;
    double winPercentage;
    double percent = 100;
    while(run)
    {
      System.out.println("Rock paper scissors simulater, which do you choose? ");
      String choice = scan.next();
      int numRand = (int) ((Math.random() * 3) + 1);
      //asigns variable rand to rock if it is equal to 1
      if (numRand == 1)
      {
        rand = "rock";
      }
      //asigns variable rand to paper if it is equal to 2
      if (numRand == 2)
      {
        rand = "paper";
      }
      //asigns variable rand to scissors if it is equal to 3
      if (numRand == 3)
      {
        rand = "scissors";
      }
      //running through game conditions if user choice equals rock
      if(choice.equals("rock"))
      {
        //loops to start if they tie and increases total games
        if(rand.equals("rock"))
        {
          System.out.println("Both rock");
          total++;
          continue;
        }
        //increases "losses" and "total" if they lose then asks if they want to play again
        if(rand.equals("scissors"))
        {
          System.out.println("You lose");
          System.out.println("Would you like to play again (y/n)");
          yN = scan.next();
          if(yN.equals("y"))
            run = true;
          losses++;
          total++;
          if(yN.equals("n"))
            run = false;
        }
        //increases "wins" and "total" if they win then asks if they want to play again
        if(rand.equals("paper"))
        {
          System.out.println("You win");
          System.out.println("Would you like to play again (y/n)");
          yN = scan.next();
          if(yN.equals("y"))
            run = true;
          if(yN.equals("n"))
            run = false;
          wins++;
          total++;
        }
      }
      //running through game conditions if user choice equals scissors
      else if(choice.equals("scissors"))
      {
        //increases "losses" and "total" if they lose then asks if they want to play again
        if(rand.equals("rock"))
        {
          System.out.println("you lose");
          System.out.println("Would you like to play again (y/n)");
          yN = scan.next();
          if(yN.equals("y"))
            run = true;
          if(yN.equals("n"))
            run = false;
          losses++;
          total++;
        }
        //increases "total" then loops to start
        if(rand.equals("scissors"))
        {
          System.out.println("you tie");
          //continue
          total++;
        }
        //increases "wins" and "total" if they win then asks if they want to play again
        if(rand.equals("paper"))
        {
          System.out.println("You win");
          System.out.println("Would you like to play again (y/n)");
          yN = scan.next();
          if(yN.equals("y"))
            run = true;
          wins++;
          total++;
          if(yN.equals("n"))
            run = false;
        }
      }
      //running through game conditions if user choice equals paper
      else if(choice.equals("paper"))
      {
        //increases "wins" and "total" if they win then asks if they want to play again
        if(rand.equals("rock"))
        {
          System.out.println("you win");
          System.out.println("Would you like to play again (y/n)");
          yN = scan.next();
          if(yN.equals("y"))
            run = true;
          wins++;
          total++;
          if(yN.equals("n"))
            run = false;
        }
        //increases "losses" and "total" if they lose then asks if they want to play again
        if(rand.equals("scissors"))
        {
          System.out.println("you lose");
          System.out.println("Would you like to play again (y/n)");
          yN = scan.next();
          if(yN.equals("y"))
            run = true;
          if(yN.equals("n"))
            run = false;
          total++;
          losses++;
        }
        //increases total then loops to start
        if(rand.equals("paper"))
        {
          System.out.println("You tie");
          total++;
          continue;
        }
      }
      //goes back to start of loop if they intered in a "y" for the question about playing again
      if(run)
      {
        continue;
      }
      //finds win percentage
      winPercentage = (wins / total) * percent;
      //if the code does not loop than the ending code is run
      if(!run)
      {
        //prints total wins, losses and total games
        System.out.println("Total wins: " + Math.round(wins) + " Toal losses: " + Math.round(losses) + " Total games: " + Math.round(total));
        System.out.println("Win Percntage: " + fmt.format(winPercentage) + "%");
      }

    }
  }
}
