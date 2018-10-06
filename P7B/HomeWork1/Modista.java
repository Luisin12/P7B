import java.util.Scanner;

public class Modista{
  public static void main(String[] args) {

    Scanner input =  new Scanner(System.in);
    System.out.println("Cantidad de metros que requiere");
    double CM= input.nextDouble();
    double PG= CM / 2.54;
    System.out.println("Las pugadas son : " + PG);

  }
}
