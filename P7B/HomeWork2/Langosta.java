import java.util.Scanner;

public class Langosta{
  public static void main(String[] args) {
    Scanner imput=new Scanner(System.in);
    System.out.println("Ingresa la cantidad de personas ");
    int NP =imput.nextInt();
int TOT;
    if(NP < 200){
      TOT=NP*95;

      System.out.println("Tu presupuesto es de "+TOT);
    }else if (NP > 300) {
      TOT=NP*75;
      System.out.println("Tu presupuesto es de "+TOT);
    }else if( NP >= 200 ||  NP <=300){
      TOT=NP*85;

      System.out.println("Tu presupuesto es de "+TOT);
    }

  }
}
