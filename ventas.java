
package controller;

import java.time.*;
import java.util.*;

public class ventas {
    private LocalDateTime hoy;
    private LinkedList<String> vendido = new LinkedList<>();
    private ArrayList <LinkedList<String>> almacenado = new ArrayList<>();
    
    
    public ventas(LinkedList<String> vendido){
    this.hoy= LocalDateTime.now();
    this.vendido=vendido;
    }
    
    public void almacen(ArrayList<LinkedList<String>> alm){
        this.hoy= LocalDateTime.now();
        this.almacenado=alm;
        
    }
            
    
    public String Ticked() {
        return "ventas{" + "Fecha:" + hoy + ", Vendido:" + vendido + '}';
    }
    
    public void anadirVentasAlmacenado(LinkedList<String> vendidoo){
        
        almacenado.add(vendidoo);
        
    }
    
    public void anadirVentas(String producto){
        vendido.add(producto);
    }
    
    
   
}
