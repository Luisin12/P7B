import javax.swing.JOptionPane;
public class DogImplement{
  public static void main(String[] args) {

    Dog fido = new Dog();
    fido.color="Black";
    fido.eyeColor="Blue";
    fido.height=0.50d;
    fido.weight=30.0d;

    Dog chilaquil = new Dog();
    chilaquil.color="Brown";
    chilaquil.eyeColor="Verde";
    chilaquil.height=0.78d;
    chilaquil.weight=25.0d;
   JOptionPane.showMessageDialog(null,"FIDO es de color "+ fido.color);
   JOptionPane.showMessageDialog(null,"Chilaquil es de color " + chilaquil.color);

   System.out.println(fido.sit());
   fido.layDown("Mi nombre es fido");
   fido.sleep();
  }
}
