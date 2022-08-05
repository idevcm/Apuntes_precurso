import javax.swing.*;

/**
 * Clase principal punto de entrada aplicación
 * @author PildorasInformáticas
 */
public class Acceso_aplicacion {
    /**
     *Función principal punto de entrada aplicación
     * @param args
     */
    public static void main(String[] args) {

        String clave="Juan";
        String pass="";

        while (clave.equals(pass)==false){

            pass=JOptionPane.showInputDialog("Introduce la contraseña, por favor");
            if (clave.equals(pass)==false){
                System.out.println("Contraseña incorrecta");
            }

        }
        System.out.println("Contraseña correcta, acceso permitido");

    }
}
