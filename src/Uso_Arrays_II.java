import javax.swing.*;

public class Uso_Arrays_II {
    public static void main(String[] args) {

        String [] paises = new String[8];

        /*paises[0] = "Espa�a";
        paises[1] = "Mexico";
        paises[2] = "Colombia";
        paises[3] = "Peru";
        paises[4] = "Chile";
        paises[5] = "Argentina";
        paises[6] = "Ecuador";
        paises[7] = "Venezuela";

        for(int i = 0; i < paises.length; i++){
            System.out.println("Pais " + (i+1) + " " + paises[i]);
         */
        //String [] paises = {"Espa�a", "Mexico", "Colombia", "Peru", "Chile", "Argentina", "Ecuador", "Venezuela"};

        for (int i = 0; i < 8 ; i++) {
            paises[i] = JOptionPane.showInputDialog("Introduce un pais" + (i + 1));
        }
        for(String elemento : paises){
            System.out.println("Pais: " + elemento);
        }
    }


}
