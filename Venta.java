package model;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Venta implements Serializable {
    @Serial
    private static final long serialVersionUID = -5444577464100368540L;

    // Almacenar los datos de la venta: Fecha de la venta, los datos del restaurante y las comidas compradas, su cantidad y datos del cliente.
    private Date fechaVenta;
    private Restaurante restaurante;
    private ArrayList<VentaComida> comidas;
    private ClienteBase cliente;

    public Venta() {
    }

    public Venta(Date fechaVenta, Restaurante restaurante, ArrayList<VentaComida> comidas, ClienteBase cliente) {
        this.fechaVenta = fechaVenta;
        this.restaurante = restaurante;
        this.comidas = comidas;
        this.cliente = cliente;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public ArrayList<VentaComida> getComidas() {
        return comidas;
    }

    public void setComidas(ArrayList<VentaComida> comidas) {
        this.comidas = comidas;
    }

    public ClienteBase getCliente() {
        return cliente;
    }

    public void setCliente(ClienteBase cliente) {
        this.cliente = cliente;
    }
}
