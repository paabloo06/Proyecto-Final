
package controller;


import java.util.*;
import model.Restaurante;


public class Lista_restaurante {
    
    //
     private static LinkedList<Restaurante> rest = new LinkedList<>();//Lista de los restaurantes que estan de alta y que ven los clientes 
     private static LinkedList<Restaurante> rest_baja = new LinkedList<>(); // Listas de los restaurantes que estan de baja y que los clientes no los ven
     //
     public static LinkedList<Restaurante> getARestaurante(){ //Método para obtener el restaurante
         return rest;
         
     }
     
     public static void setARestaurante(Restaurante retu){ //Método para añadir los restaurantes
         rest.add( retu);
     }
     
     public static void DarBaja (Restaurante retus){ //Metodo para dar de Baja a los restaurantes
             for (Restaurante comp : rest){
                 if (comp.getNombre().equals(retus.getNombre())){
                     rest.remove(retus);
                     rest_baja.add(retus);
                 }
         }
      
     
     }             
     public static LinkedList<Restaurante> getBajas(){
         return rest_baja;
     }
     
     public static void DarAlta (Restaurante retus){ 
         for(Restaurante comp : rest_baja){
             if(comp.getNombre().equals(retus.getNombre())){
                 rest_baja.remove(retus);
                 rest.add(retus);
             }
         }
     }
}
