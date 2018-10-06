import javax.swing.JOptionPane;

public class ForLoop{
  public static void main(String[] args) {
  int value = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number"));
  String salida="";



while (value != 0){
  for (int i=0; i<=9; i++){
        salida += value + " x " + (i + 1 ) + " = " + ( i + 1) * value + "\n" ;
        value = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number"));
  }JOptionPane.showInputDialog(null, salida);
    }
  }
}
