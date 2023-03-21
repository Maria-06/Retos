package Retos;

import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        //declarar variables
        int kelvin=0;
        double centigrados;

        //instanciar clase
        Scanner leer=new Scanner(System.in);

        //solicitar datos
        System.out.println("Ingresa la temperatura en grados kelvin");
        //capturar datos
        kelvin=leer.nextInt();

        //proceso
        centigrados=kelvin-273.15;

        //imprimir datos
        System.out.println("La temperatura en grados centigrados es:"+centigrados);

        leer.close();
    }
}
