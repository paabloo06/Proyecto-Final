package controller;

import model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Constantes {
    public final static String PATH_USERS = "files/users.txt";
    public final static String PATH_RESTAURANTS = "files/restaurants.txt";
    public final static String PATH_SALES = "files/sales.txt";

    public static UsuarioBase USUARIO_ACTUAL = null;


    public static void cargarUsuarios() {
        //------------------ USUARIOS --------------------//
        // Lista usuarios
        List<UsuarioBase> usuarios = new ArrayList<>();
        UsuarioBase admin = new Administrador("admin@javaeat.com", "admin");

        // Direccion de cliente-particular
        Direccion direccionCliente = new Direccion("San Pedro", 93, "28500", "Madrid");
        //Tarjeta de credito del cliente particular
        Date caducidad1 = new Date(2023, 04, 25);
        TarjetaCredito tarjetaCredito = new TarjetaCredito("Miguel Garre", "1000100010001000", caducidad1);
        // creacion de cliente particular
        UsuarioBase clienteParticular = new ClienteParticular("12345678A", "particular@gmail.com", "particular", "Miguel", direccionCliente, tarjetaCredito, 611111111);

        // Direccion de cliente-empresa
        Direccion direccionEmpresa = new Direccion("Antequera", 72, "28000", "Alcala de Henares");
        //Tarjeta de credito de cliente-empresa
        Date caducidad2 = new Date(2024, 12, 23);
        TarjetaCredito tarjetaEmpresa = new TarjetaCredito("Macarena.SA", "1234567891123456", caducidad2);
        //creacion de cliente-empresa
        UsuarioBase clienteEmpresa = new ClienteEmpresa("1111111A", "macarena.com", "empresa@gmail.com", "empresa", "Macarena.SA", direccionEmpresa, tarjetaEmpresa, 123456789);

        usuarios.add(admin);
        usuarios.add(clienteParticular);
        usuarios.add(clienteEmpresa);

        FileUtils.writeToFile(Constantes.PATH_USERS, usuarios);
    }

    public static void cargarRestaurante(){
        List<Restaurante> restaurantes = new ArrayList<>();

        // Direccion de restaurante 1
        Direccion direccionRestaurante1 = new Direccion("San Pedro", 93, "28500", "Madrid");
        // creacion de restaurante
        Restaurante restaurante1 = new Restaurante();
        restaurante1.setCif("A12345678");
        restaurante1.setNombre("McDonalds");
        restaurante1.setDireccion(direccionRestaurante1);
        restaurante1.setEspecialidad(Restaurante.Especialidad.RAPIDA);
        restaurante1.setGastosEnvio(2.5);
        restaurante1.setTiempoMedio(30);
        restaurante1.setHayCatering(false);

        // Direccion de restaurante 2
        Direccion direccionRestaurante2 = new Direccion("Antequera", 72, "28000", "Alcala de Henares");
        // creacion de restaurante 2
        Restaurante restaurante2 = new Restaurante();
        restaurante2.setCif("B12345678");
        restaurante2.setNombre("Burger King");
        restaurante2.setDireccion(direccionRestaurante2);
        restaurante2.setEspecialidad(Restaurante.Especialidad.RAPIDA);
        restaurante2.setGastosEnvio(3.5);
        restaurante2.setTiempoMedio(20);
        restaurante2.setHayCatering(true);

        // Direccion de restaurante 3
        Direccion direccionRestaurante3 = new Direccion("Antequera", 2, "28003", "Alcala de Henares");
        // creacion de restaurante 3
        Restaurante restaurante3 = new Restaurante();
        restaurante3.setCif("C12345678");
        restaurante3.setNombre("Telepizza");
        restaurante3.setDireccion(direccionRestaurante3);
        restaurante3.setEspecialidad(Restaurante.Especialidad.ITALIANA);
        restaurante3.setGastosEnvio(0);
        restaurante3.setTiempoMedio(40);
        restaurante3.setHayCatering(true);

        // Direccion de restaurante 4
        Direccion direccionRestaurante4 = new Direccion("Mayor", 23, "28504", "Madrid");
        // creacion de restaurante 4
        Restaurante restaurante4 = new Restaurante();
        restaurante4.setCif("D12345678");
        restaurante4.setNombre("Asian Food");
        restaurante4.setDireccion(direccionRestaurante4);
        restaurante4.setEspecialidad(Restaurante.Especialidad.ASIATICA);
        restaurante4.setGastosEnvio(4);
        restaurante4.setTiempoMedio(35);
        restaurante4.setHayCatering(true);

        // Direccion de restaurante 5
        Direccion direccionRestaurante5 = new Direccion("Menor", 21, "28504", "Madrid");
        // creacion de restaurante 5
        Restaurante restaurante5 = new Restaurante();
        restaurante5.setCif("E12345678");
        restaurante5.setNombre("La Tagliatella");
        restaurante5.setDireccion(direccionRestaurante5);
        restaurante5.setEspecialidad(Restaurante.Especialidad.ITALIANA);
        restaurante5.setGastosEnvio(0);
        restaurante5.setTiempoMedio(30);
        restaurante5.setHayCatering(false);

        // Direccion de restaurante 6
        Direccion direccionRestaurante6 = new Direccion("Plaza Mayor", 4, "28501", "Madrid");
        // creacion de restaurante 6
        Restaurante restaurante6 = new Restaurante();
        restaurante6.setCif("F12345678");
        restaurante6.setNombre("La Mafia");
        restaurante6.setDireccion(direccionRestaurante6);
        restaurante6.setEspecialidad(Restaurante.Especialidad.GALLEGA);
        restaurante6.setGastosEnvio(11);
        restaurante6.setTiempoMedio(20);
        restaurante6.setHayCatering(false);

        // Direccion de restaurante 7
        Direccion direccionRestaurante7 = new Direccion("Plaza Mayor", 14, "28501", "Madrid");
        // creacion de restaurante 7
        Restaurante restaurante7 = new Restaurante();
        restaurante7.setCif("G12345678");
        restaurante7.setNombre("Mama Lola");
        restaurante7.setDireccion(direccionRestaurante7);
        restaurante7.setEspecialidad(Restaurante.Especialidad.GALLEGA);
        restaurante7.setGastosEnvio(0);
        restaurante7.setTiempoMedio(32);
        restaurante7.setHayCatering(true);

        restaurantes.add(restaurante1);
        restaurantes.add(restaurante2);
        restaurantes.add(restaurante3);
        restaurantes.add(restaurante4);
        restaurantes.add(restaurante5);
        restaurantes.add(restaurante6);
        restaurantes.add(restaurante7);

        FileUtils.writeToFile(Constantes.PATH_RESTAURANTS, restaurantes);
    }
}
