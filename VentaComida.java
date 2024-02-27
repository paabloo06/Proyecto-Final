package model;

import java.io.Serial;
import java.io.Serializable;

public class VentaComida implements Serializable {
    @Serial
    private static final long serialVersionUID = -3452299381834446085L;

    private Comida comida;
    private int cantidad;

    public VentaComida() {
    }

    public VentaComida(Comida comida, int cantidad) {
        this.comida = comida;
        this.cantidad = cantidad;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
