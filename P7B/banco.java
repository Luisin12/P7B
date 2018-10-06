import java.util.Scanner;

public class banco{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Type of card?");
    int TT= input.nextInt();
    System.out.println("Whats is your credit limit?");
    int LA = input.nextInt();

    if (TT == 1){
    int AC= LA * 25 /100;
int NC = AC + LA;

  System.out.println("Your new crdit is "  + NC);
}else if (TT == 2){
  int AC= LA * 35 /100;
int NC = AC + LA;

System.out.println("Your new crdit is "  + NC);
}else if(TT == 3){
  int AC= LA * 40 /100;
int NC = AC + LA;

System.out.println("Your new crdit is "  + NC);

}else if(TT >= 4){
  int AC= LA * 50 /100;
int NC = AC + LA;

System.out.println("Your new crdit is "  + NC);

}
 }
}
