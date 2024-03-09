/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerparcial;

/**
 *
 * @author Julra
 */
public class nodonumerosenteros {
     int dato; // Almacenar el valor del nodo 
    
    nodonumerosenteros siguiente; //Referencia al siguiente nodo
    
    //Constructor para crear un nuevo nodo con el valor proporcionado
    public nodonumerosenteros (int dato) 
    {
        
        //inicializamos los valores de nodo null
        this.dato = dato;
        this.siguiente = null;
        
    }
}
