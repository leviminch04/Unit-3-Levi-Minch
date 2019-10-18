import java.util.Scanner;

public class DigitScanner {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("What is your number?");
    int num = scan.nextInt();
    int even = 0;
    int odd = 0;
    int zero = 0;
    for (int i = 1; i <= num; i++) {
      if (i % 2 == 0){
        even++;
      }
      if (i % 2 == 1) {
        odd++;
      }
      if (i % 10 == 0) {
        zero++;
      }
    }
    System.out.println("Number of even numbers: " + even);
    System.out.println("Number of odd numbers: " + odd);
    System.out.println("Number of zero numbers: " + zero);

  }
}
