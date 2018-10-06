import java.util.Scanner;

public class Almacen{
  public static void main(String[] args) {
    Scanner imput=new Scanner(System.in);
    System.out.println("Ingrese su cantidad a pagar ");
    int CT =imput.nextInt();
int DE;
int PF;
    if(CT >= 2500){
      DE=(CT*15) / 100;
      PF = CT - DE;
      System.out.println("Tu pago con descuento del %15 es de "+PF);
    }else if(CT <2500){
      DE=(CT*8) / 100;
      PF = CT - DE;
      System.out.println("Tu pago con descuento del %8 es de "+PF);
    }

  }
  }
