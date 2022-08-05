import javax.swing.*;

public class Evalua_edad {
    public static void main(String[] args) {
/*
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce tu edad, por favor");

        int edad=entrada.nextInt();

        if(edad>=18){
            System.out.println("Eres mayor de edad");
        }else {
            System.out.println("Eres menor de edad");
        }

*/
        /*
        String num1= JOptionPane.showInputDialog("Introduce tu edad, por favor");
        int edad=Integer.parseInt(num1);

        if(edad>=18){
            System.out.println("Tienes "+ edad +" y por lo tanto eres mayor de edad");
        } else{
            System.out.println("Tienes "+ edad +" años y por lo tanto eres menor de edad");
        }

         */
        String num1= JOptionPane.showInputDialog("Introduce tu edad, por favor");
        int edad=Integer.parseInt(num1);

        if(edad<14){
            System.out.println("Eres un niño");

        } else if (edad<18) {
            System.out.println("Eres un adolescente");

        } else if (edad<40) {
            System.out.println("Eres joven");

        } else if (edad<65) {
            System.out.println("Eres maduro");

        }else{
            System.out.println("Cuidate");
        }

    }
}
