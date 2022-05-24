
package Instrucciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Juego {
    static Scanner sc = new Scanner(System.in);
    static int numeroIngresado;
    public static void main(String[] args) {
        System.out.println("Juego adivina un numero del 1 al 10");
        getNumberByKeyword();
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
        getNumberByKeyword();
        distancia = aleatorio-numeroIngresado;
      }
        System.out.println("El numero era:" +aleatorio);    
    }
    public static void getNumberByKeyword(){
           while(true){
           try{
                System.out.println("Ingresa un numero:");
                numeroIngresado = sc.nextInt();
                if(numeroIngresado>=1&&numeroIngresado<=10){
                    break;
                }
                System.out.println("El numero debe ser mayor a 0 y menor a 10");
             } catch(InputMismatchException exeption){
                 System.out.println("Numero invalido, por favor ingrese caracteres validos");
                 sc.nextLine();
             }   
         }
       }
}
