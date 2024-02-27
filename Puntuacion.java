package model;

import java.io.Serial;
import java.io.Serializable;

public class Puntuacion implements Serializable {

    @Serial
    private static final long serialVersionUID = 6313160252435788742L;

    private int calificacion; // de a 1 a 5
    private String comentario;
    private String nombreUsuario;

    public Puntuacion(int calificacion, String comentario, String nombreUsuario) {
        this.calificacion = calificacion;
        this.comentario = comentario;
        this.nombreUsuario = nombreUsuario;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    // convertir calificacion en estrellas
    public static String convertirCalificacionEnEstrellas(int calificacion) {
        StringBuilder estrellas = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            if (i < calificacion) estrellas.append(" ★");
            else estrellas.append(" ☆");
        }
        return estrellas.toString();
    }

    // convertir estrellas en calificacion
    public static int  convertirEstrellasEnCalificacion(String estrellas) {
        // ver cuantas estrellas hay, se cuenta el numero de estrellas negras y se divide entre 2 porque hay espacios entre ellas
        int estrellasNegras = estrellas.lastIndexOf("★");
        estrellasNegras = estrellasNegras /2 + 1;
        return estrellasNegras;
    }
}
