package controller;
import java.util.*;

public class Lista_comidas {
    private static LinkedList<String> restaurante1 = new LinkedList<>();
    private static LinkedList<String> restaurante2 = new LinkedList<>();
    private static LinkedList<String> restaurante3 = new LinkedList<>();
    private static LinkedList<String> restaurante4 = new LinkedList<>();
    
    // GETTERS
    public LinkedList<String> getRestaurant1() {
        return restaurante1;
    }
    
    public LinkedList<String> getRestaurant2() {
        return restaurante2;
    }
    
    public LinkedList<String> getRestaurant3() {
        return restaurante3;
    }
    
    public LinkedList<String> getRestaurant4() {
        return restaurante4;
    }
    
    public void agregarComida(int restaurante, String comida) {
        LinkedList<String> restauranteActual = getRestaurante(restaurante);
        if (restauranteActual != null) {
            restauranteActual.add(comida);
        } else {
            System.out.println("Restaurante no válido");
        }
    }
    
    public void quitarComida(int restaurante, String comida) {
        LinkedList<String> restauranteActual = getRestaurante(restaurante);
        if (restauranteActual != null) {
            restauranteActual.remove(comida);
        } else {
            System.out.println("Restaurante no válido");
        }
    }
    
    //MIRAR -------------------------------------------
     /* Función auxiliar para obtener la lista de restaurantes 
    correcta en función del número de restaurante proporcionado.
    RELACIONAR CON LA INTERFAZ - list*/
    
    private LinkedList<String> getRestaurante(int restaurante) {
        switch (restaurante) {
            case 1:
                return restaurante1;
            case 2:
                return restaurante2;
            case 3:
                return restaurante3;
            case 4:
                return restaurante4;
            default:
                return null;
        }
    } 
}
