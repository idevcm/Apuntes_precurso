import javax.swing.*;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Se crea un numero aleatorio y tenemos que adivinarlo

        int aleatorio=(int)(Math.random()*100);
        Scanner entrada=new Scanner(System.in);

        do {
            System.out.println("Introduce un numero");
            int pass=entrada.nextInt();

            if(pass>aleatorio){
                System.out.println("Mas bajo");
            }else if (pass<aleatorio){
                System.out.println("Mas alto");
            }
        }while (entrada.equals(aleatorio)==false);

        System.out.println("Enhorabuena");

    }
}
