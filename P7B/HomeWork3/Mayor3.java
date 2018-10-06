import java.util.Scanner;

public class Mayor3{
  public static void main(String[] args) {

    Scanner input =new Scanner(System.in);
    System.out.println("Enter the first value");
    int A=input.nextInt();
    System.out.println("Enter the two value");
    int B=input.nextInt();
    System.out.println("Enter the three value");
    int C=input.nextInt();
    int M=0;
    if(A >= B && A >= C){
       M=A;
       System.out.println("The highest value is :"+ M);
    }else if(B >= A && B >= C){
    M=B;
    System.out.println("The highest value is :"+ M);
  }else if(C >= A && C >= B ){
    M=C;
    System.out.println("The highest value is :"+ M);
    }
    
  }

}
