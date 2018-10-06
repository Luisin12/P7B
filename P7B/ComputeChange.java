import java.util.Scanner;

public class ComputeChange{
   public static void main(String[] args) {
     //Variable Scanner
    Scanner input =  new Scanner(System.in);
    System.out.println("Enter an amount in double");
    double amount= input.nextDouble();
    int cents =(int) (amount * 100);
    //find the number of dollarsss
    int numberOfDollars = cents/100;
    cents = cents % 100;
    //esta operacion me devuelve el reciduo

    //find the quarters
    int numbersOfQuarters= cents/25;
    //number of times
    int numberOfTimes =cents/10;
    cents = cents % 10;
    //number of nickels
    int numberOfNickels =cents/5;
    cents = cents % 5;

    //number of pennies
    int numberOfPennies =cents;
    System.out.println("Your amount "+ amount + "consist of \n" +
    "\t" + numberOfDollars+ "Dollars "+
    "\t" + numberOfDollars + "Quaters " +
    "\t" + numberOfTimes + "Times " +
    "\t" + numberOfNickels + "Nickels " +
    "\t" + numberOfPennies + "Pennies "  );
  }
}
