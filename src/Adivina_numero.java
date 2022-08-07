import java.util.Scanner;

/**
 * Hola esto es un comentario
 */

public class Adivina_numero {
    public static void main(String[] args) {

        int aleatorio = (int)(Math.random() * 100);

        Scanner entrada = new Scanner(System.in);
        int numero=0;


        //Do While

        do{
            intentos++;
            System.out.println("Introduce un numero, por favor");
            numero=entrada.nextInt();

            if(numero > aleatorio){
                System.out.println("Mas bajo");
            }else if(numero < aleatorio){
                System.out.println("Mas alto");
            }

        }while (numero != aleatorio);
        System.out.println("Correcto. Lo has conseguido en "+ intentos + " intentos");
    }
}
