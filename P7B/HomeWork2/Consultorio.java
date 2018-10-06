import java.util.Scanner;

public class Consultorio{
  public static void main(String[] args) {
    Scanner imput=new Scanner(System.in);
    System.out.println("Ingresa el numero de consultas ");
    int NC =imput.nextInt();
int TOT;
int CC;
    if(NC <= 3){
      CC =200;
      TOT = NC * CC;
      System.out.println("Tu pago por cita es de "+CC);
      System.out.println("Tu pago por tratamiento es de "+TOT);
    }else if (NC >3 && NC <=5) {
      CC =150;
      TOT = NC * CC;
      System.out.println("Tu pago por cita es de "+CC);
      System.out.println("Tu pago por tratamiento es de "+TOT);
    }else if( NC >5 && NC <=8){
      CC =100;
      TOT = NC * CC;
      System.out.println("Tu pago por cita es de "+CC);
      System.out.println("Tu pago por tratamiento es de "+TOT);
    }else if( NC >8){
      CC =50;
      TOT = NC * CC;
      System.out.println("Tu pago por cita es de "+CC);
      System.out.println("Tu pago por tratamiento es de "+TOT);
    }

  }
}
