package Retos;

import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        int cantidad=0;
        int precio,total=0, suma=0;

        Scanner leer=new Scanner(System.in);

        System.out.println("¿Cuantos productos comprarás?");
        cantidad=leer.nextInt();

        for(int i=0; i<cantidad; i++){

            System.out.println("Ingrese el precio del producto");
            precio=leer.nextInt();
            suma=suma+precio;
        }

        total=suma+cantidad;
        System.out.println("El valor total de la compra es:"+total);

    leer.close();
    }
}
