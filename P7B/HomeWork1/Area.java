import java.util.Scanner;

public class Area{
  public static void main(String[] args) {

    Scanner input =  new Scanner(System.in);
    System.out.println("Ingresa la altura");
    int A= input.nextInt();
    System.out.println("Ingresa la base");
    int B= input.nextInt();
    int result= A*B;
    System.out.println("El Area es: " + result);

  }
}
