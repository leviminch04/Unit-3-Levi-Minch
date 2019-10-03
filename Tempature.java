import java.util.Scanner;

public class Tempature{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("What is the tempature?");
    int temp = scan.nextInt();
    if (temp < 45)
      System.out.println("cold");
    else if (temp <= 67)
      System.out.println("cool");
    else if (temp <= 83)
      System.out.println("ideal");
    else
      System.out.println("hot");
  }
}
