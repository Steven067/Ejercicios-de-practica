import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* EJERCICIO N°1

            Pide un nombre por teclado y haz que salude
            Ejemplo: Si introduces "Fernando", La respuesta debe ser ¡Hola Fernando!

         */

        Scanner sn = new Scanner (System.in);

        System.out.println("Ingresa tu nombre: ");
        String nombre = sn.nextLine();

        System.out.println("¡Hola " + nombre + "!");

    }
}