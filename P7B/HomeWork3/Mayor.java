import java.util.Scanner;

public class Mayor{
  public static void main(String[] args) {

    Scanner input =new Scanner(System.in);
    System.out.println("Enter the first value");
    int A=input.nextInt();
    System.out.println("Enter the two value");
    int B=input.nextInt();
    int M=0;
    if(A > B){
       M=A;
       System.out.println("The highest value is :"+ M);
    }else if(B > A){
    M=B;
    System.out.println("The highest value is :"+ M);
    }
    else{
  System.out.println("The number is the same" );
    }



  }

}
