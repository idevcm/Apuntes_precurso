import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {

    //Acceso a app con contraseña
        String contraseña="Pepe";
        String entrada="";

        do {

            entrada=JOptionPane.showInputDialog("Introduce la contraseña");

            if (contraseña.equals(entrada)==false){
                System.out.println("Contraseña Incorrecta");
            }

        }while (contraseña.equals(entrada)==false);
        System.out.println("Contraseña Correcta");
    }
}
