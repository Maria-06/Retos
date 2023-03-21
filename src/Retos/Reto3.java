package Retos;

import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
    
        //declarar variables
        String nombreJugador;
        int elegir,aleatorio;
        double valorApuesta=0 , gana=0,pierde=0;

        Scanner leer=new Scanner(System.in);

                                            
        System.out.println("¿Cual es su nombre?");
        nombreJugador=leer.next();


        System.out.println("¿Cuanto desea apostar?");
        valorApuesta=leer.nextDouble();

        if(valorApuesta<=10000){
            System.out.println("Eliga: \n 1.Cara\n 2.Sello");
            elegir=leer.nextInt();
    
            System.out.println("El sistema esta eligiendo una opción");
            aleatorio=(int)(Math.random()*2)+1;
    
            if(elegir==1 && aleatorio==1){
                gana=valorApuesta*2;
                System.out.println("El jugador "+nombreJugador+" le salió Cara ¡GANASTE! y te quedan "+gana);
            }else if(elegir==1 && aleatorio==2){
                System.out.println("El jugador "+nombreJugador+"Salió Cara ¡PERDISTE! y te quedan "+pierde);
            }else if(elegir==2 && aleatorio==2){
                gana=valorApuesta*2;
                System.out.println("El jugador"+nombreJugador+"Salió Sello ¡GANASTE! y te quedan "+gana);
            }else if(elegir==2 && aleatorio==1){
                System.out.println("El jugador"+nombreJugador+"Salió Sello ¡PERDISTE! y te quedan "+pierde);
            }
        }else{
            System.out.println("El valor ingresado es muy alto no le permite jugar");
        }

        leer.close();
    }
}
