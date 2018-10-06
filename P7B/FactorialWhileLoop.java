import javax.swing.JOptionPane;

public class FactorialWhileLoop{
  public static void main(String[] args) {
  int value = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter an int value"));
  int fact=1;
  int i = 1;
  while (i <= value){
        fact =fact * i;
    i ++;
    }
  JOptionPane.showMessageDialog(null, "El factorial de "+ value + " es " + fact, "Calcular factorial", JOptionPane.WARNING_MESSAGE  );
  }
}
