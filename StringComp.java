import java.util.Scanner;
public class stringComp {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("First word");
    String word1 = scan.next();
    System.out.println("Second word");
    String word2 = scan.next();

    System.out.println(word1.compareTo(word2));
  }
}
