import java.util.Scanner;

public class GuessBirthday{
  public static void main(String[] args) {
    String set1 = " 1 3 5 7 \n" +
                  " 9 11 13 15 \n" +
                  " 17 19 21 23 \n" +
                  " 25 27 29 31 \n" ;

   String set2 = " 2 3 6 7 \n" +
                 " 10 11 14 15 \n" +
                 " 18 19 22 23 \n" +
                 " 26 27 30 31 \n" ;

  String set3 = " 4 5 6 7 \n" +
                " 12 13 14 15\n" +
                " 20 21 22 23 \n" +
                " 28 29 30 31 \n" ;

  String set4 = " 8 9 10 11 \n" +
                " 12 13 14 15 \n" +
                " 24 25 26 27 \n" +
                " 28 29 30 31 \n" ;

  String set5 = " 16 17 18 19 \n" +
                " 20 21 22 23 \n" +
                " 24 25 26 27 \n" +
                " 28 29 30 31 \n" ;

  Scanner input = new Scanner(System.in);
  int day = 0 ;
  System.out.println( "Is you birtday in set 1? \n");
  System.out.println(set1);
  System.out.println("\n Enter 0 for NO and 1 for YES: ");
  int answer= input.nextInt();
  if(answer == 1){
    day = day +1; //acumulador
  }
  System.out.println( "Is you birtday in set 2? \n");
  System.out.println(set2);
  System.out.println("\n Enter 0 for NO and 1 for YES: ");
  answer= input.nextInt();
  if(answer == 1){
    day = day +2; //acumulador
  }
  System.out.println( "Is you birtday in set 3? \n");
  System.out.println(set3);
  System.out.println("\n Enter 0 for NO and 1 for YES: ");
  answer= input.nextInt();
  if(answer == 1){
    day = day +4; //acumulador
  }
  System.out.println( "Is you birtday in set 4? \n");
  System.out.println(set4);
  System.out.println("\n Enter 0 for NO and 1 for YES: ");
  answer= input.nextInt();
  if(answer == 1){
    day = day +8; //acumulador
  }
  System.out.println( "Is you birtday in set 5? \n");
  System.out.println(set5);
  System.out.println("\n Enter 0 for NO and 1 for YES: ");
  answer= input.nextInt();
  if(answer == 1){
    day = day +16; //acumulador
  }
  System.out.println("\n Your birthday is " + day);
  }
}
