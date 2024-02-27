package model;

import java.io.Serial;
import java.io.Serializable;

public class Administrador extends UsuarioBase implements Serializable {

    @Serial
    private static final long serialVersionUID = -3354978576480389465L;

    public Administrador(String Correo, String Clave) {
        super(Correo, Clave, Rol.Administrador);
    }
}
