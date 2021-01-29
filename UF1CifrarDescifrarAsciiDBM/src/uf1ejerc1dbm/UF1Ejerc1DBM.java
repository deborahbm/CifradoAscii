/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf1ejerc1dbm;
import com.dbm.controlcifrado;
import java.util.Scanner;

/**
 *
 * @author dealm
 */
public class UF1Ejerc1DBM {
    
    
    /**
     * @param args the command line argumentssq
     */    
    public static void main(String[] args) 
    {
        // TODO code application logic here
       //declaramos variable con la cadena del mensaje  
       //muestra en pantalla el resultado de la llamada el resultado cifrado
       controlcifrado ControlCifrado;
       
      ControlCifrado = new controlcifrado ();      
       Scanner consola = new Scanner(System.in);
       boolean salir = false;
       int opcion; //Guarda la opcion elegida en el menú
       
       System.out.println("Introduzca el mensaje a cifrar:");
       ControlCifrado.setTextoEntrada(consola.nextLine());
       ControlCifrado.cifrar();
       ControlCifrado.descifrar();       
   
       
       while(!salir){
           System.out.println("Escriba una de las opciones:"); 
           System.out.println("1. Opcion 1: Cifrar");
           System.out.println("2. Opcion 2: Descifrar");
           System.out.println("3. Opcion 3: Mostrar valor Ascii de la última letra del mensaje");
           System.out.println("4. Opcion 4: Mostrar Recorrido: Texto introducido, Cifrado y Descifrado");
           System.out.println("5. Salir");
           
           opcion = consola.nextInt();
           
          switch (opcion) {
                    case 1:
                        System.out.println("El mensaje cifrado es:" + ControlCifrado.getMensajeCifrado());
                        break;
                    case 2:
                        System.out.println("El mensaje descifrado es:" + ControlCifrado.getMensajeDescifrado());
                        break;
                    case 3:
                        System.out.println("El valor de la última letra del mensaje en Ascii es: " + ControlCifrado.clave());
                        break;
                    case 4:
                        System.out.println("El mensaje de entrada es:" + ControlCifrado.getTextoEntrada());
                        System.out.println("El mensaje cifrado es:" + ControlCifrado.getMensajeCifrado());
                        System.out.println("El mensaje descifrado es:" + ControlCifrado.getMensajeDescifrado());
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 5"); 
           
           }
       }    
    }
}
