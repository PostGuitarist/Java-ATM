import java.util.Scanner;

public class Main {  

  private static double balance = 0.00;

  public static void checkBal(){
    System.out.println(balance);
  }

  public static void depoSit(double x){
    balance += x;
    System.out.println("New balance: " + balance);
  }

  public static void withDraw(double y){
    balance -= y;
    System.out.println("New balance: " + balance);
  }
  
  public static void main(String args[]) { 
    Scanner scan = new Scanner(System.in);

    boolean running = true;
    
    System.out.println("Welcome to a Java-based ATM!");
    while(running){
      System.out.println("Please input what you would like to do.");
      System.out.println("1 - Check Balance   2 - Deposit   3 - Withdraw   4 - Quit");  
      int selection = scan.nextInt();
    
      if(selection == 1){
        checkBal();
      }
      else if(selection == 2){
        System.out.println("Please input how much to deposit.");
        double dep = scan.nextDouble();
        depoSit(dep);
      }
      else if(selection == 3){
        System.out.println("Please input how much to withdraw");
        double withd = scan.nextDouble();
        if(withd > balance){
          System.out.println("Not enough funds available.");
        }
        else{
          withDraw(withd);
        }
      }
      else if(selection == 4){
        running = false;
      }  
      else{
        System.out.println("Not a valid answer.");
      }
    }  
  }
}
