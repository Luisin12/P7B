import java.util.Scanner;

public class ComputeBMI{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    final double KILOGRAMS_PER_POUND= 0.453592;
    final double  METERS_PER_INCH=0.0254;

    System.out.println("Enter weight in pounds: ");
    double  weight = input.nextDouble();

  System.out.println("Enter height in inches");
  double  height = input.nextDouble();

  double weightInKILOGRAMS = weight * KILOGRAMS_PER_POUND;
  double heightInMeters= height * METERS_PER_INCH;

  double bmi = weightInKILOGRAMS / Math.pow(heightInMeters , 2);

System.out.println("Your BMI is  " +  bmi);

  if(bmi < 16)
System.out.println("Your are seriusly uderweight");
else if (bmi < 18 )
System.out.println("Your are uderweight ");
else if (bmi < 24)
System.out.println("Your are normal weight ");
else if (bmi < 29)
System.out.println("Your are overweight ");
else if (bmi < 35)
System.out.println("Your are seriusly overweight ");
else
System.out.println("Your are gravely weight ");


  }

}
