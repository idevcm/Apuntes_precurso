public class manipula_cadenas {
    public static void main(String[] args) {

        String nombre="Felipe Juan Froilan de Todos los Santos";

        System.out.println("Mi nombre es " + nombre + " y tiene " + nombre.length() + " letras");
        System.out.println("Mi nombre tiene " + nombre.length() + " letras");
        System.out.println("La primera letra de " + nombre + " es la " + nombre.charAt(0));

        int ultima_letra;
        ultima_letra=nombre.length(); // también podría hacerse int ultima_letra=nombre.length();
        System.out.println("Y la ultima letra es la " + nombre.charAt(ultima_letra-1));
    }
}
