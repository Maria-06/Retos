package Retos;

import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        //declarar variables
        String nombreMama, nombreVacuna;
        int meses,peso,cantidadDosis;

        //instanciar clase
        Scanner leer=new Scanner(System.in);

        //solicitar datos
        System.out.println("Ingresa el nombre de la Mamá");
        //capturar datos
        nombreMama=leer.next();

        System.out.println("Ingresa el nombre de la Vacuna");
        nombreVacuna=leer.next();

        System.out.println("¿Cual es el peso del bebé?");
        peso=leer.nextInt();

        System.out.println("¿Cuantos meses tiene el bebé?");
        meses=leer.nextInt();

        //proceso
        cantidadDosis=((peso+10)/(meses*10)*8);

        System.out.println("Mamita,"+nombreMama+" el nombre de la vacuna es: " +nombreVacuna+
        " y las dosis a aplicar son: "+cantidadDosis);

        leer.close();
    }
}
