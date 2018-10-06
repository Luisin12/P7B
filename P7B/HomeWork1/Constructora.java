import java.util.Scanner;

public class Constructora{
  public static void main(String[] args) {

    Scanner input =  new Scanner(System.in);
    System.out.println("Ingresa la altura de la figura");
    int A= input.nextInt();
    System.out.println("Ingresa la base de la figura");
    int B= input.nextInt();
    System.out.println("Ingresa la altura de triagulo");
    int C= input.nextInt();
    A=A-C;
    int AT= (B*C) /(2) ;
    System.out.println("El Area del triagulo es: " + AT);
    int AR= B*A;
    System.out.println("El Area del rectangulo es: " + AR);
    int Area= AT*AR;
    System.out.println("El Area del terreno es: " + Area);

  }
}
