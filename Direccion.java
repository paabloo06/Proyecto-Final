
package model;


import java.io.Serial;
import java.io.Serializable;

public class Direccion implements Serializable {
    @Serial
    private static final long serialVersionUID = -8827799079058489624L;

    //----ATRIBUTOS----//
    private String calle;
    private int numero;              //Numero de casa
    private String cp;
    private String ciudad;
    
    //----METODOS----//

    //GETTER Y SETTER DE CALLE
    public String getCalle() {
        return calle;
    }

    public void setCalle(String Calle) {
        this.calle = Calle;
    }

    //GETTER Y SETTER DE NUMERO
    public int getNumero() {
        return numero;
    }

    public void setNumero(int Numero) {
        this.numero = Numero;
    }

    //GETTER Y SETTER DE CODIGO POSTAL
    public String getCodigoPostal() {
        return cp;
    }

    public void setCodigoPostal(String CodigoPostal) {
        this.cp= CodigoPostal;
    }

    //GETTER Y SETTER DE CIUDAD
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.ciudad = Ciudad;
    }
    
    //CONSTRUCTOR

    public Direccion(String Calle, int Numero, String CodigoPostal, String Ciudad) {
        this.calle = Calle;
        this.numero = Numero;
        this.cp = CodigoPostal;
        this.ciudad = Ciudad;
    }
    
    //TO STRING

    @Override
    public String toString() {
        return "Calle: " + calle + ", Número: " + numero + ", Código Postal: " + cp + ", Ciudad: " + ciudad;
    }
    
    
}
