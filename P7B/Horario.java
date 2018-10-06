import javax.swing.JOptionPane;


public class Horario{

  public static void main(String[] args) {
    //int[][]  inlgles = new int[3][2];
    int inglesI = 111;
    int algebraL = 112;
    int Taller = 113;
    int estadistica = 114;
    int fundamentos = 115;
    int dibujo= 116;
    int quimica = 117;

    int inglesII = 118;
    int fisica = 119;
    int PCC = 120;
    int calculo = 121;
    int Pavanzada = 122;
    int Resistencia= 123;
    int biologia = 124;

    String semestre1 =
                  "\n\n 1er Semestre \n" +
                  "CODIGO / MATERIA \n\n" +
                  "111 INGLES I \n" +
                  "112 ALGEBRA LINEAL \n" +
                  "113 TALLER DE EXPRESION \n" +
                  "114 PROBABILIDAD Y ESTADISTICA \n" +
                  "115 FUNDAMENTOS DE LA PROGRAMACION\n" +
                  "116 DIBUJO Y DISENO POR COMPUTADORA \n" +
                  "117 QUIMICA \n\n\n" ;
    String semestre2 =
                  "\n\n 2do Semestre \n" +
                  "CODIGO / MATERIA \n\n" +
                  "118 INGLES II \n" +
                  "119 FISICA \n" +
                  "120 PENSAMIENTO CRITICO Y CREATIVO \n" +
                  "121 CALCULO \n" +
                  "122 PROGRAMACION AVANZADA\n" +
                  "123 RESISTENCIA DE MATERIALES \n" +
                  "124 BIOLOGIA \n\n\n" ;
    int day =0;
    int materia= JOptionPane.showConfirmDialog(null,"Aprobaste todas tus materias? \n");
//int value = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number"));
    if (materia ==JOptionPane.YES_OPTION){
      materia= JOptionPane.showConfirmDialog(null,"Tu horario para tu nuevo semestre es \n"+semestre1);
      //dat=day +1 //acumulador
    day +=1;//acumulador resumido
  } else if (materia ==JOptionPane.NO_OPTION ){
    boolean comprobar = true;
    int value = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa tu materia repobada por codigo "+semestre1));
    int sum = 0;
    while (comprobar == true){
      sum ++;

      if(value == 111 && 111 == inglesI){
        JOptionPane.showMessageDialog(null,"Tu horario para tu nuevo semestre es \n"+semestre2+ inglesI+ " INGLES I" );

      }if(value == 112 && 112 == algebraL){
        JOptionPane.showMessageDialog(null,"Tu horario para tu nuevo semestre es \n"+semestre2+ algebraL+ " ALGEBRA LINEAL" );

      }if(value == 113 && 113 == Taller){
        JOptionPane.showMessageDialog(null,"Tu horario para tu nuevo semestre es \n"+semestre2+ Taller+ " TALLER DE EXPRESION" );

      }if(value == 114 && 114 == estadistica){
        JOptionPane.showMessageDialog(null,"Tu horario para tu nuevo semestre es \n"+semestre2+ estadistica+ " PROBABILIDAD Y ESTADISTICA" );

      }if(value == 115 && 115 == fundamentos){
        JOptionPane.showMessageDialog(null,"Tu horario para tu nuevo semestre es \n"+semestre2+ fundamentos+ " FUNDAMENTOS DE LA PROGRAMACION" );

      }if(value == 116 && 116 == dibujo){
        JOptionPane.showMessageDialog(null,"Tu horario para tu nuevo semestre es \n"+semestre2+ dibujo+ " DIBUJO Y DISENO POR COMPUTADORA" );

      }if(value == 117 && 117 == quimica){
        JOptionPane.showMessageDialog(null,"Tu horario para tu nuevo semestre es \n"+semestre2+ quimica+ " QUIMICA" );

      }
    }comprobar = false;//value = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa tu materia repobada por codigo "+semestre1));
  }
  }
}
