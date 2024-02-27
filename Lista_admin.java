
package controller;

import java.util.*;
import model.UsuarioBase;

public class Lista_admin {
    //
    private static ArrayList<UsuarioBase> Ads = new ArrayList<>();
    
    //
    public static ArrayList<UsuarioBase> getAdmins(){ //Metodo de obtener la lista de los admins
        return Ads;
    }
    
    public static void setAdmins(UsuarioBase adms){ // Metodo de añadir admins a la lista
        Ads.add(adms);
    }
    
}
