import java.util.Scanner;

public class Lapices{
  public static void main(String[] args) {

    Scanner imput=new Scanner(System.in);
    System.out.println("How many pencils are? ");
    int X =imput.nextInt();
int PAG;
    if(X >= 1000){
      PAG=(X*85);
      System.out.println("you prague "+PAG);
    }else if(X <1000){
      PAG=(X*90);
      System.out.println("you prague "+PAG);
    }

  }
}
