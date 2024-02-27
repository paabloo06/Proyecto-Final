
package controller;

import java.util.*;
import model.Comida;

public class ListaCarrito {
    
    private  LinkedList<Comida> comm = new LinkedList<>();
    private LinkedList<Comida> comcat = new LinkedList<>();
    

   
    
    public static List<String> ponerNombresPreciosProductos (LinkedList<Comida>coomm,String serv,String esp,LinkedList<Comida>commcaat){
        List <String> nombres = new LinkedList<>();
        
        for (Comida nom : coomm){
            nombres.add(nom.getTitulo() + ": "+ nom.getPrecio());
            }
        nombres.add("Catering: " + SumarCatering(serv,esp,commcaat));
        
        return nombres;
        
    }

    
    
    public static double SumarCatering (String pedido_serv, String pedido_esp,LinkedList<Comida>concat){
        double aux = 0;
        
        for(Comida com: concat){
            aux+=com.getPrecio();
        }
        for(int i=0; i<pedido_serv.length(); i++){
            String auxt=pedido_serv.substring(0,8);
            if(auxt.equals("cocineros")){
               aux+=1000;
               pedido_serv=pedido_serv.replace(auxt,"");

            }
            if(auxt.equals("camareros")){
               aux+=800;
               pedido_serv=pedido_serv.replace(auxt,"");
            }
            else{
                auxt="";
                auxt=pedido_serv.substring(0,9);
                if(auxt.equals("decoracion")){
                    aux+=500;
                    pedido_serv=pedido_serv.replace(auxt,"");
            }
        }
    }
        for(int j = 0; j<pedido_esp.length();j++){
            String auxt1="";
            auxt1=pedido_esp.substring(0, 1);
            if(auxt1.equals("si")){
                aux+=1000;
                pedido_esp=pedido_esp.replace(auxt1,"" );
            }
        }
        
return aux;
    }
    
    
    //Metodo para guardarlo en el las ventas
    
   
    
    
    
}


