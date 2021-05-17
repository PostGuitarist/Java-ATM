import java.util.Scanner;

class Main {  

  private double balance = 0.00;

  public double checkBal(){
    return balance;
  }

  public double depoSit(double x){
    balance += x;
    return "New balance: " + balance;
  }

  public double withDraw(double y){
    balance -= y;
    return "New balance: " + balance;
  }
  
  public static void main(String args[]) { 
    Scanner scan = new Scanner(System.in);

    System.out.println("Welcome to a Java-based ATM!");
    System.out.println("Please input what you would like to do.");
    System.out.println("1 - Check Balance   2 - Deposit   3 - Withdraw");  
    int selection = scan.nextInt();
    
    if(selection == 1){
      checkBal();
    }
    else if(selection == 2){
      System.out.println("Please input how much to deposit.");
      double dep = scan.nextDouble;
      depoSit(dep);
    }
    else if(selection == 3){
      System.out.println("Please input how much to withdraw");
      double withd = scan.nextDouble;
      withDraw(withd);
    }
    else{
      System.out.println("Not a valid answer.");
    }
      
  }
}
