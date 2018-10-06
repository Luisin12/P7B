import java.util.Scanner;

public class Chimefon{
  public static void main(String[] args) {
    Scanner imput=new Scanner(System.in);
    System.out.println("Ingresa el tipo usado ");
    int TI =imput.nextInt();
    System.out.println("Ingresa el tipo de dia ");
    String DI =imput.nextLine();
    System.out.println("Ingresa el tipo de dia ");
    String TU =imput.nextLine();
    double TOT;
    double PAG;
    double IMP;
    if(TI < 5 && DI =="DOMINGO"){
      PAG = TI *1;
      IMP = PAG * 0.05;
      TOT= PAG * IMP;
      System.out.println("Total a pagar por timpo "+PAG);
      System.out.println("Total a pagar impuesto "+IMP);
      System.out.println("Total a pagar  "+TOT);
    }else if( TU == "M" ){

      System.out.println("Total a pagar por alumno ");
      System.out.println("Total a pagar a la comáñia ");
    }

  }
}
