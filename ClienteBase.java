
package model;


import java.io.Serial;
import java.io.Serializable;

public class ClienteBase extends UsuarioBase implements Serializable {

    @Serial
    private static final long serialVersionUID = 4187524878138390919L;

    //----ATRIBUTOS----//
    private String nombre;
    private Direccion direccion;             //*ASOCIACIÓN POR COMPOSICIÓN*//
    private TarjetaCredito tarjeta;         //*ASOCIACIÓN POR COMPOSICIÓN*//
    private  int telefono;

    public ClienteBase() {
        super();
    }

    //----METODOS----//
    //GETTER Y SETTER DE NOMBRE
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    //GETTER Y SETTER DE DIRECCION
    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion Direccion) {
        this.direccion = Direccion;
    }

    //GETTER Y SETTER DE TARJETA

    public TarjetaCredito getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaCredito tarjeta) {
        this.tarjeta = tarjeta;
    }

    //GETTER Y SETTER DE TELEFONO
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int Telefono) {
        this.telefono = Telefono;
    }
    
    
    
   //CONSTRUCTOR

    public ClienteBase(String correo, String clave, Rol rol, String nombre, Direccion direccion, TarjetaCredito tarjeta, int telefono) {
        super(correo, clave, rol);
        this.nombre = nombre;
        this.direccion = direccion;
        this.tarjeta = tarjeta;
        this.telefono = telefono;
    }

    //TO STRING

    @Override
    public String toString() {
        return "CLIENTES{" + "Correo=" + getCorreo() + ", Clave=" + getContrasena() + ", Nombre=" + nombre + ", Direccion=" + direccion + ", Tarjeta=" + tarjeta + ", Telefono=" + telefono + '}';
    }
    
    
    }
    
    

    
    
    
    
    

