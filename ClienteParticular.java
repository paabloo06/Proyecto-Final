
package model;


import java.io.Serial;
import java.io.Serializable;

public class ClienteParticular extends ClienteBase implements Serializable {


    @Serial
    private static final long serialVersionUID = -5560288983675830063L;

    //----ATRIBUTOS----//
    private String dni;
    
    //----METODOS----//
    
    //CONSTRUCTOR
    public ClienteParticular() {
        super();
        setRol(Rol.Particular);
    }

    public ClienteParticular(String dni, String correo, String clave, String nombre, Direccion direccion, TarjetaCredito tarjeta, int telefono) {
        super(correo, clave, Rol.Particular, nombre, direccion, tarjeta, telefono);
        this.dni = dni;
    }

    //GETTER Y SETTER DE DNI

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    //TO STRING

    @Override
    public String toString() {
        return "ClienteParticular{" + "DNI=" + dni + '}';
    }
    
    
}
