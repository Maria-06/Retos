package Retos;

import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
        int jugada,aleatorio;
        double valorApuesta=0, ganar=0, perder=0;
        String nombreJugador;

        Scanner leer=new Scanner(System.in);

        System.out.println("¿Cual es su nombre?");
        nombreJugador=leer.next();

        System.out.println("¿Cuanto desea apostar?");
        valorApuesta=leer.nextDouble();

        if(valorApuesta>10000){
            System.out.println("Eliga: \n1.Piedra \n2.Papel \n3Tijera");
            jugada=leer.nextInt();
    
            System.out.println("Cargando la respuesta del sistema");
            aleatorio=(int)(Math.random()*3)+1;
    
            if(jugada==1 && aleatorio==3){
                ganar=valorApuesta*2;
                System.out.println("El jugador"+nombreJugador+" Salio Tijera, ¡GANASTE! y su monto es "+ganar);
            }else if(jugada==1 && aleatorio==2){
                System.out.println("El jugador"+nombreJugador+" Salio Piedra, PERDISTE!  y su monto es "+perder);
            }else if(jugada==1 && aleatorio==1){
                System.out.println("El jugador"+nombreJugador+" Salio Papel, ¡EMPATE!  y su monto es "+valorApuesta);
            }else if(jugada==2 && aleatorio==1){
                ganar=valorApuesta*2;
                System.out.println("El jugador"+nombreJugador+" Salio Piedra, ¡GANASTE!  y su monto es "+ganar);
            }else if(jugada==2 && aleatorio==2){
                System.out.println("El jugador"+nombreJugador+" Salio Papel, ¡EMPATASTE!  y su monto es "+valorApuesta);
            }else if(jugada==2 && aleatorio==3){
                System.out.println("El jugador"+nombreJugador+" Salio Tijera, ¡PERDISTE!  y su monto es "+perder);
            }else if(jugada==3 && aleatorio==1){
                System.out.println("El jugador"+nombreJugador+" Salio Piedra, ¡PERDISTE!  y su monto es "+perder);
            }else if(jugada==3 && aleatorio==2){                
                ganar=valorApuesta*2;
                System.out.println("El jugador"+nombreJugador+" Salio Papel, ¡GANASTE!   y su monto es "+ganar);
            }else if(jugada==3 && aleatorio==3){
                System.out.println("El jugador"+nombreJugador+" Salio Tijera, ¡EMPATE!  y su monto es "+valorApuesta);
            }else{
                System.out.println("El valor que ingreso no es valido");
            }
        }
        

        leer.close();
    }
}
