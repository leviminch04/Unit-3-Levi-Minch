import java.util.Scanner;

public class Multiples {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean running = true;
    boolean run = true;
    while (running) {
      int num = 1;
      boolean restart = false;
      System.out.println("What is your max?");
      int max = scan.nextInt();
      System.out.println("What is your multiple?");
      int multiple = scan.nextInt();
      if (multiple > max) {
        System.out.println("multiple cant be bigger than max");
        restart = true;
      }
      if(multiple <= 0){
        System.out.println("multiple cant be less than or equal to zero");
        restart = true;
      }
      if(max <= 0){
        System.out.println("max cant be less than or equal to zero");
        restart = true;
      }
      if (restart){
        continue;
      }
      if(running){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        for (int i = 1; i <= max; i++) {
          running = false;
          if (i % multiple == 0) {
            run = true;
            if(num < 5){
              System.out.print(i + " ");
              num++;
              run = false;
            }
            if(num >= 5){
              System.out.println(i + " ");
              num = 1;
            }
          }
        }
      }
    }
  }
}
