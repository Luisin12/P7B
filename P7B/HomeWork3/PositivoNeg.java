import java.util.Scanner;

public class PositivoNeg{
public static void main(String[] args) {
      double R;
      Scanner imput=new Scanner(System.in);

  System.out.println("Ingresa un numero");
  int NUM= imput.nextInt();

  if(NUM==0){
    R =NUM;
  System.out.println("El numero "+R+" es nulo");
  } else{
  if(NUM>0){
    R =NUM;
  System.out.println("El numero "+R+" es positivo");
  }else{
    R =NUM;
  System.out.println("El numero "+R+" es negativo");
  }
  }
}
}
