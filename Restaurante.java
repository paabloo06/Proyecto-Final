
package model;

import java.io.Serial;
import java.io.Serializable;
import java.util.*;

public class Restaurante implements Serializable {

    @Serial
    private static final long serialVersionUID = 3534235606559157077L;

    public enum Especialidad {RAPIDA, ASIATICA, ITALIANA, GALLEGA}
    //----ATRIBUTOS----//
    private String cif;
    private String nombre;
    private Direccion direccion;            //Asocicacion por composicion
    private Especialidad especialidad;
    private double gastosEnvio;
    private double tiempoMedio;
    private boolean hayCatering;
    private boolean estaDeBaja;     //Asociacion por agregación
    private ArrayList<Puntuacion> puntuaciones;
    private ArrayList<Comida> comidas;       //Asociación por composición

    //----METODOS----//

    //GETTER Y SETTER DE CIF
    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    //GETTER Y SETTER DE NOMBRE

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    //GETTER Y SETTER DE ESPECIALIDAD
    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad Especialidad) {
        this.especialidad = Especialidad;
    }

    //GETTER Y SETTER DE GASTOS DE ENVIO
    public double getGastosEnvio() {
        return gastosEnvio;
    }

    public void setGastosEnvio(double GastosEnvio) {
        this.gastosEnvio = GastosEnvio;
    }

    public double getTiempoMedio() {
        return tiempoMedio;
    }

    //GETTER Y SETTER DE TIEMPO MEDIO
    public void setTiempoMedio(double TiempoMedio) {
        this.tiempoMedio = TiempoMedio;
    }

    //GETTER Y SETTER DE SI HAY CATERING
    public boolean hayCatering() {
        return hayCatering;
    }

    public void setHayCatering(boolean HayCatering) {
        this.hayCatering = HayCatering;
    }

    //GETTER Y SETTER DE SI ESTA DE BAJA
    public boolean estaDeBaja() {
        return estaDeBaja;
    }

    public void setEstaDeBaja(boolean estaDeBaja) {
        this.estaDeBaja = estaDeBaja;
    }

    //GETTER Y SETTER DE COMIDAS

    public ArrayList<Comida> devolverComidas() {
        return comidas;
    }


    public void setComida(Comida comida) {
        this.comidas.add(comida);
    }

    public void eliminarComida(String id) {
        for (Comida comida : comidas) {
            if (comida.getId().equals(id)) {
                comidas.remove(comida);
                break;
            }
        }
    }

    //GETTER Y SETTER DE DIRECCION DEL RESTAURANTE

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Puntuacion> getPuntuaciones() {
        return puntuaciones;
    }

    public void setPuntuaciones(ArrayList<Puntuacion> puntuaciones) {
        this.puntuaciones = puntuaciones;
    }

    //GETTER QUE CALCULA LA CALIFICACION MEDIA en int redondeando hacia arriba o hacia abajo segun cual esté mas cerca
    public int getCalificacionMedia() {
        int sumaCalificaciones = 0;
        for (Puntuacion puntuacion : puntuaciones) {
            sumaCalificaciones += puntuacion.getCalificacion();
        }
        if (puntuaciones.size() == 0) return 0;
        return sumaCalificaciones / puntuaciones.size();
    }

    // GETTER QUE DEVUELVE LA CALIFICACION MEDIA EN ESTRELLAS
    public String getCalificacionMediaEstrellas() {
        int calificacionMedia = getCalificacionMedia();
        return Puntuacion.convertirCalificacionEnEstrellas(calificacionMedia);
    }

    //CONSTRUCTORES
    public Restaurante() {
        this.estaDeBaja = false;
        // init puntuaciones
        this.puntuaciones = new ArrayList<>();
        // init comidas
        this.comidas = new ArrayList<>();
    }

}
 