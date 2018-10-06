public class Dog{

  String color;
  String eyeColor;
  Double height;
  Double lenght;
  Double weight;

  public String sit(){
    return "Estoy sentado";

  }
  public void bark(){
    System.out.println("wauff wauff wauff");
  }
  public void layDown(String name){
    System.out.println(name + "Estoy recostado");
  }
  public void eat(){
    System.out.println("Estoy comiendo");
  }
  public void sleep(){
    System.out.println("zzzzzZZZZZZ");
  }

}
