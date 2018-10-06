import java.util.Scanner;

public class Viaje{
  public static void main(String[] args) {
    Scanner imput=new Scanner(System.in);
    System.out.println("Ingresa la cantidad de alumnos ");
    int NA =imput.nextInt();
int TOT;
int PA;
    if(NA >= 100){
      PA=65;
      TOT = NA * PA;
      System.out.println("Total a pagar por alumno "+PA);
      System.out.println("Total a pagar a la comáñia "+TOT);
    }else if( NA < 30 ){
            PA = 4000/NA;
      TOT = 4000;
      System.out.println("Total a pagar por alumno "+PA);
      System.out.println("Total a pagar a la comáñia "+TOT);
    }else if (NA >= 50 && NA <=99) {
      PA=70;
      TOT = NA * PA;
      System.out.println("Total a pagar por alumno "+PA);
      System.out.println("Total a pagar a la comáñia "+TOT);
    }else if( NA >= 30 ||  NA <=49){
      PA = 95;
      TOT = NA * PA;
      System.out.println("Total a pagar por alumno "+PA);
      System.out.println("Total a pagar a la comáñia "+TOT);
    }

  }
}
