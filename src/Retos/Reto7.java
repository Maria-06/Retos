package Retos;

import java.util.Scanner;

public class Reto7 {

    //ejercicio emoji
    public static void main(String[] args) {
    int fila;
    int columna;

    Scanner lectura=new Scanner(System.in);

    System.out.println("Cuantas filas voy a poner");
    fila =lectura.nextInt();

    System.out.println("Cuantas columnas voy a poner");
    columna =lectura.nextInt();

    String emojis[][] = new String [fila][columna];

    for(int i=0; i<fila; i++){
        for(int j=0; j<columna; j++){
        System.out.println("Digite el numero de la posicion"+i+"-"+j);
        emojis[i][j]=lectura.next();
        }
    }

    for(int i=0; i<fila; i++){
        for(int j=0; i<columna; i++){
        System.out.println("[" +emojis[i][j] +"]" +" \t");
        }
        System.out.println(" ");
    }
    lectura.close();
    }
}


