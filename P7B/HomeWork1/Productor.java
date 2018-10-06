import java.util.Scanner;

public class Productor{
  public static void main(String[] args) {

    Scanner input =  new Scanner(System.in);
    System.out.println("Ingresa los litros que produce");
    int L= input.nextInt();
    System.out.println("Ingresa precio de galon");
    int PG= input.nextInt();
    double GALON= 3.785;
    double TG= (L / GALON) * (PG);
    System.out.println("El productor obtiene : " + TG + "Pesos");

  }
}
