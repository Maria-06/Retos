package Retos;

import java.util.Random;
import java.util.Scanner;

public class Reto6 {
    public static void main(String[] args) {
        String nombreJugador ;
        int valorApuesta, eleccion, sistema;
        double ganar=0,  perder=0, respuesta;

        Scanner leer=new Scanner(System.in);

        System.out.println("Ingrese el nombre del jugador ");
        nombreJugador=leer.next();

        System.out.println("Ingrese el valor a apostar");
        valorApuesta=leer.nextInt();

        Random aleatorio=new Random();
        
        System.out.println();
        sistema=aleatorio.nextInt(2)+1;

        if(valorApuesta>=10000){
            System.out.println("Eliga: 1.Cara y 2.Sello");
            eleccion=leer.nextInt();

                if(eleccion==1 && sistema==1){
                    ganar=valorApuesta*2;
                    System.out.println("El jugador "+nombreJugador+" Salió Cara ¡GANASTE! y te quedan "+ganar);
                }else if(eleccion==1 && sistema==2){
                    System.out.println("El jugador "+nombreJugador+" Salió Cara ¡PERDISTE! y te quedan "+perder);
                }else if(eleccion==2 && sistema==2){
                    ganar=valorApuesta*2;
                    System.out.println("El jugador "+nombreJugador+" Salió Sello ¡GANASTE! y te quedan "+ganar);
                }else if(eleccion==2 && sistema==1){
                    System.out.println("El jugador "+nombreJugador+" Salió Sello ¡PERDISTE! y te quedan "+perder);
                }else{
                    System.out.println("Debe apostar mas de 10.000");
                }

                if(ganar>0){
                    System.out.println("¿Desea continuar jugando?: 1.Si 2.No");
                    respuesta=leer.nextInt();

                    if(respuesta==1){
                        do{
                            System.out.println("Ingrese el valor a apostar");
                            valorApuesta=leer.nextInt(); 

                            if(eleccion==1 && sistema==1 ||eleccion==2 && sistema==2  ){
                                ganar=valorApuesta*2;
                                System.out.println("El jugador "+nombreJugador+" le salió Cara ¡GANASTE! y te quedan "+ganar);
                            }else if(eleccion==1 && sistema==2){
                                System.out.println("El jugador "+nombreJugador+"Salió Cara ¡PERDISTE! y te quedan "+perder);
                            }else if(eleccion==2 && sistema==2){
                                ganar=valorApuesta*2;
                                System.out.println("El jugador "+nombreJugador+"Salió Sello ¡GANASTE! y te quedan "+ganar);
                            }else if(eleccion==2 && sistema==1){
                                System.out.println("El jugador 1"+nombreJugador+"Salió Sello ¡PERDISTE! y te quedan "+perder);
                            }else{
                                System.out.println("Debe apostar mas de 10000");
                            }                        
                        }while(respuesta==2);{
                            System.out.println("Juego termimnado");
                        }
                    }
                }
        }else{
            System.out.println("Debe apostar mas de 10000");
        }
        leer.close();
    }
}

