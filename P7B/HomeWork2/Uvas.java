import java.util.Scanner;

public class Uvas{
  public static void main(String[] args) {

    Scanner imput=new Scanner(System.in);
    System.out.println("Ingresa el precio inicial del  kilo de uva ");
    double P = imput.nextDouble();
    System.out.println("Ingresa los kilo de uva ");
    int K =imput.nextInt();
    System.out.println("Tamaño de uva 1 o 2 ");
    int TA =imput.nextInt();
    System.out.println("Tipo de uva A o B? ");
    String TI =imput.nextLine();

    double GA;

    if(TI == "A" && TA == 1){
      GA=(P*K)+.20;

      System.out.println("Tu ganancia es de "+GA);
    }else if (TI == "A" && TA == 2) {
      GA=(P*K)+.30;

      System.out.println("Tu ganancia es de "+GA);
    }else if (TI == "B" && TA == 1) {
      GA=(P*K)-.30;

      System.out.println("Tu ganancia es de "+GA);

  }else if (TI == "B" && TA == 2) {
    GA=(P*K)-.50;

    System.out.println("Tu ganancia es de "+GA);
  }

  }
}
