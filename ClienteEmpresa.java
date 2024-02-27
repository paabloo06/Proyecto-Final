
package model;


import java.io.Serial;
import java.io.Serializable;

public class ClienteEmpresa extends ClienteBase implements Serializable {

    @Serial
    private static final long serialVersionUID = 2837603243841441928L;

    //----ATRIBUTOS----//
    private String cif;
    private String web;

    //-----METODOS----//

    //CONSTRUCTOR
    public ClienteEmpresa() {
        super();
        setRol(Rol.Empresa);
    }

    public ClienteEmpresa(String cif, String web, String correo, String clave, String nombre, Direccion direccion, TarjetaCredito tarjeta, int telefono) {
        super(correo, clave, Rol.Empresa, nombre, direccion, tarjeta, telefono);
        this.cif = cif;
        this.web = web;
    }


    //GETTER Y SETTER DE CIF

    public String getCIF() {
        return cif;
    }

    public void setCIF(String cif) {
        this.cif = cif;
    }


    //GETTER Y SETTER DE WEB

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }


    // TO STRING

    @Override
    public String toString() {
        return "ClienteEmpresa{" + "CIF=" + cif + ", Web=" + web + '}';
    }
}
    
    
    

