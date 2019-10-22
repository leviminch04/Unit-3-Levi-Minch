// ask mr. george if tied games count towards the total games for win percentage


import java.util.Scanner;

public class RockPaperScissors
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
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
    double roundWinPercentage;
    while(run)
    {
      System.out.println("Rock paper scissors simulater, which do you choose? ");
      String choice = scan.next();
      int numRand = (int) ((Math.random() * 3) + 1);
      if (numRand == 1)
      {
        rand = "rock";
      }
      if (numRand == 2)
      {
        rand = "paper";
      }
      if (numRand == 3)
      {
        rand = "scissors";
      }
      if(choice.equals("rock"))
      {
        if(rand.equals("rock"))
        {
          System.out.println("Both rock");
          total++;
          continue;
        }
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
      else if(choice.equals("scissors"))
      {
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
        if(rand.equals("scissors"))
        {
          System.out.println("you tie");
          //continue
          total++;
        }
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
      else if(choice.equals("paper"))
      {
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
        if(rand.equals("paper"))
        {
          System.out.println("You tie");
          total++;
          continue;
        }
      }
      if(run)
      {
        continue;
      }
      winPercentage = (wins / total) * 100;
      roundWinPercentage = Math.round(winPercentage * 100) / 100;
      if(!run)
      {
        System.out.println("Total wins: " + wins + " Toal losses: " + losses + " Total " + total);
        System.out.println("Win Percntage: " + winPercentage);
      }

    }
  }
}
