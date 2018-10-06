import java.util.Scanner;

public class Conagua{
  public static void main(String[] args) {

    Scanner input =  new Scanner(System.in);
    System.out.println("Altura de la alberca");
    double A= input.nextDouble();
    System.out.println("Largo de la alberca");
    double L= input.nextDouble();
    System.out.println("Ancho de la alberca");
    double N= input.nextDouble();
    System.out.println("Costo de metro cubico");
    double CM= input.nextDouble();
    double V= L * N * A;
    double PAG = V * CM;

    System.out.println("El pago es de : " + PAG + " Pesos");

  }
}
