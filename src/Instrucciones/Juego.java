
package Instrucciones;

import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Juego adivina un numero del 1 al 10");
        System.out.println("Ingresa un numero:");
        int numeroIngresado = sc.nextInt();
        
        int aleatorio;
        aleatorio = (int) (Math.random()*10 + 1);
        int distancia = aleatorio-numeroIngresado;
                
        while (true){
        if(aleatorio == numeroIngresado){
            System.out.println("Felicidades, acertaste!");
            break;
        }
        else if (distancia <= 2 && distancia >=-2 /*||aleatorio - numeroIngresado <= -2 */){
            System.out.println("Caliente");            
        }
        else if (distancia <= 4 && distancia > 2 || distancia < -2 && distancia >=-4 /*||aleatorio - numeroIngresado <= -4 */){
            System.out.println("Tibio");
        }
        else if (distancia > 4 ||distancia < -4){
            System.out.println("Frio");
        }
        numeroIngresado = sc.nextInt();
        distancia = aleatorio-numeroIngresado;
      }
        System.out.println("El numero era:" +aleatorio);    
        
    }
}
