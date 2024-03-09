/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerparcial;

/**
 *
 * @author Julra
 */
public class listanumerosenteros {

//referencia el primer nodo de la lista de enteros
nodonumerosenteros cabeza; 

//Creamos un constructor para inicializar la lista como vacia
public listanumerosenteros ()
{
    this.cabeza = null;//El inicio de la lista de numeros comienza en vacia
    
}

//Metodo para insertar un nuevo nodo al inicio de la lista de numeros enteros

public void insertarAlInicio (int dato){
  //Creamos un nuevo nodo con el valor proporcionado
  nodonumerosenteros nuevonodo = new nodonumerosenteros (dato);
  //Verificamos si la lista esta vacia
  if(cabeza == null){
      //Establecer el siguiente del nuevo nodo como el mismo
      nuevonodo.siguiente = nuevonodo;
      //El nuevo nodo se combierte en cabeza de la lista circular
      cabeza = nuevonodo;
      
  }else{
      //Se establece el nuevo nodo como la cabeza actual
      nuevonodo.siguiente = cabeza;
      nodonumerosenteros temp = cabeza; 
      //Avanzamos hasta el ultimo nodo de la lista
      while (temp.siguiente != cabeza){
          temp = temp.siguiente;
          
      }
      
      /*Establecemos el enlace o siguiente del ultimo nodo como el nuevo nodo */
      
      temp.siguiente = nuevonodo;
      //Actualizamos la cabeza par que apunte al nuevo nodo
      cabeza = nuevonodo;
  }
}

public void insertarAlFinal (int dato){
  //Creamos un nuevo nodo con el valor proporcionado
  nodonumerosenteros nuevonodo = new nodonumerosenteros (dato);
  //Verificamos si la lista esta vacia
  if(cabeza == null){
      //Establecer el siguiente del nuevo nodo como el mismo
      nuevonodo.siguiente = nuevonodo;
      //El nuevo nodo se combierte en cabeza de la lista circular
      cabeza = nuevonodo;
      
  }else{
      //Se establece el nuevo nodo como la cabeza actual
      nuevonodo.siguiente = cabeza;
      nodonumerosenteros temp = cabeza; 
      //Avanzamos hasta el ultimo nodo de la lista
      while (temp.siguiente != cabeza){
          temp = temp.siguiente;
          
      }
      
      /*Establecemos el enlace o siguiente del ultimo nodo como el nuevo nodo */
      
      temp.siguiente = nuevonodo;
      
  }
}

//Metodo para eliminar un nodo al inicio como el mismo

public void eliminarAlInicio (){

  //Verificamos si la lista esta vacia
  if(cabeza == null){
     nodonumerosenteros temp = cabeza; 
      //Avanzamos hasta el ultimo nodo de la lista
      while (temp.siguiente != cabeza){
          temp = temp.siguiente;
          
      }
      //Verificamos que la lista solo tenga un nodo
      if (temp == cabeza){
          cabeza = null; //Si solo tiene un nodo queda vacia
     
  }else{
      //eliminar el enlace al primer nodo
      temp.siguiente = cabeza.siguiente;
      //La cabeza se mueve al siguiente nodo
      cabeza = cabeza. siguiente;
        
      }
  }else{
      System.out.println ("La lista se encuentra vacia.");
  }
     
}
//Metodo para imprimir los elementos de la lista circular
public void imprimir (){
    //Verificar si la lista esta vacia
    if (cabeza == null){
        System.out.println ("La Lista circular esta vacia");
        return;
    }
    nodonumerosenteros temp = cabeza; 
    System.out.print("Lista circular");
    do{
        //imprime el valor del nodo actual
    System.out.print (temp.dato + " ");
    //Avanza el siguiente nodo
    temp = temp.siguiente;
    //Repite hasta volver al inicio de la lista circular simple
    }while(temp != cabeza);
    System.out.println();
}
}


