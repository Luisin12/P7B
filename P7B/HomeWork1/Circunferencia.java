import java.util.Scanner;

public class Circunferencia{
  public static void main(String[] args) {

    Scanner input =  new Scanner(System.in);
    System.out.println("Ingresa el radio");
    int R= input.nextInt();
    double PI= 3.1416;
    double result= (PI) *(R*R);
    System.out.println("El Area de la circunferencia es: " + result);

  }
}
