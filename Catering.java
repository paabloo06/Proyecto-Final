
package model;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;

public class Catering implements Serializable {

    @Serial
    private static final long serialVersionUID = -8841585395351662036L;

    //----ATRIBUTOS----//
     private ArrayList<Comida> comida;
     private ArrayList<Double> servicio;
     private ArrayList<Double> espacio;


     
     //----METODOS----//
    public ArrayList<Comida> getComida() {
        return comida;
    }

    public void setComida(ArrayList<Comida> comida) {
        this.comida = comida;
    }

    public ArrayList<Double> getServicio() {
        return servicio;
    }

    public void setServicio(ArrayList<Double> servicio) {
        this.servicio = servicio;
    }

    public ArrayList<Double> getEspacio() {
        return espacio;
    }

    public void setEspacio(ArrayList<Double> espacio) {
        this.espacio = espacio;
    }

    // CONSTRUCTOR
    public Catering(ArrayList<Comida> comida) {
        this.comida = comida;

    }
// TO STRING
    @Override
    public String toString() {
        return "Catering{" + "comida=" + comida + ", servicio=" + servicio + ", espacio=" + espacio + '}';
    }


}
