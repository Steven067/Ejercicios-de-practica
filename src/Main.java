import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* EJERCICIO N°1

            Pide un nombre por teclado y haz que salude
            Ejemplo: Si introduces "Fernando", La respuesta debe ser ¡Hola Fernando!

         */



       // Scanner sn = new Scanner (System.in);

       // System.out.println("Ingresa tu nombre: ");
        //String nombre = sn.nextLine();

        //System.out.println("¡Hola " + nombre + "!");


        /*  EJERCIOCIO N°2

            Pide el precio de un producto sin iva y calcula su precio con iva
            EL IVA ES DEL 21%
            Formatea el resultado para que se muestre con dos decimales

        */

     final double IVA = 0.21;

    Scanner sn = new Scanner(System.in);
    System.out.println("Ingrese el Precio del producto: ");
    double producto = sn.nextDouble();
    double iva = producto * IVA;
    double precioFinal =  producto + iva;
    System.out.printf("El precio de su producto es: %.2f ", precioFinal);

    }
}