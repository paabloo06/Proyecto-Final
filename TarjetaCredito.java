
package model;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;


public class TarjetaCredito implements Serializable {

    @Serial
    private static final long serialVersionUID = -708715775067721775L;

    //----ATRIBUTOS----//
    private String Nombre;       //Nombre del titular
    private String Numero16;        //Numero de 16 digitos
    private Date Caduca;
    
    
    //----METODOS----//

    //GETTER Y SETTER DE NOMBRE DEL TUTULAR
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    
    //GETTER Y SETTER DEL NUMERO DE 16 DÍGITOS
    public String getNumero16() {
        return Numero16;
    }

    public void setNumero16(String Numero16) {
        this.Numero16 = Numero16;
    }

    //GETTER Y SETTER DE LA FECHA DE CADUCIDAD
    public Date getCaduca() {
        return Caduca;
    }

    public void setCaduca(Date Caduca) {
        this.Caduca = Caduca;
    }
    
    //CONSTRUCTOR

    public TarjetaCredito(String Nombre, String Numero16, Date Caduca) {
        this.Nombre = Nombre;
        this.Numero16 = Numero16;
        this.Caduca = Caduca;
    }
    
    //TO STRINTG

    @Override
    public String toString() {
        return "TarjetaCredito{" + "Nombre=" + Nombre + ", Numero16=" + Numero16 + ", Caduca=" + Caduca + '}';
    }
    
    
}
