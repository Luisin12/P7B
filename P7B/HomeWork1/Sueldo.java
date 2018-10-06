import java.util.Scanner;

public class Sueldo{
  public static void main(String[] args) {

    Scanner input =  new Scanner(System.in);
    System.out.println("Horas trabajadas");
    double HT= input.nextDouble();
    System.out.println("Pago por hora");
    double PH= input.nextDouble();
    double SS= HT * PH;

    System.out.println("El sueldo semanal es de : " + SS + " Pesos");

  }
}
