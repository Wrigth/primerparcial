/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primerparcial;
/**
 *
 * @author Julra
 */
import java.util.Scanner;
public class Primerparcial {

    public static void main(String[] args) {
        //Creamos un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner (System.in);
        //Crea una nueva lista circular simple
        listanumerosenteros lista = new listanumerosenteros ();
        
        //Creamos un menu
        /*Bucle infinito*/
        while (true){
            System.out.println("Opciones");
            System.out.println("1. Insertar el primer dato");
            System.out.println("2. Insertar el segundo dato");
            System.out.println("3. Eliminar los duplicados de la lista");
            System.out.println("4. Imprimir la lista");
            System.out.println("5. Salir");
            System.out.println("1. Seleccione una opcion");
            //lee la opcion seleccionada por el usuario
            int opcion = scanner.nextInt();
            
            //Creamos un switch para evaluuar la seleccion del usuario
            switch(opcion){
                case 1:
                    //Se solicita al usuario ingresar el elemento
                    System.out.println("Ingrese el elemento a insertar");
                    //Lee el elemento proporcionado por el usuario
                    String elementoInicio = Scanner.nextLine();
                    //insertar los elementos
                    lista.insertarAlInicio(elementoInicio);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                {
            System.out.println("La lista no esta duplicada");
        }
                                     
            }
        }
    }
}
    
