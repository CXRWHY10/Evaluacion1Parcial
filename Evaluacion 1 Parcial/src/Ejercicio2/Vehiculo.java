package Ejercicio2;
import java.util.ArrayList;
import java.util.List;
public class Vehiculo {
    private String marca;
    private String modelo;
    private double precio;

    Vehiculo(String marca, String modelo, double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    public double getPrecio() {
        return precio;
    }
    public void MostrarDetalles(){
        System.out.println("Marca: "+marca+ '/' + "Modelo: "+modelo+ '/' +"Precio: "+precio);
    }
}
class main {
    public static void main (String[]args){
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Vehiculo("Toyota","Corolla",3000));
        vehiculos.add(new Vehiculo("Audi","BMW",4500));
        vehiculos.add(new Vehiculo("Ford","Mustang",3500));
        vehiculos.add(new Vehiculo("Honda","Civic",2500));
        buscarVehiculo(vehiculos, 2500, 4000);
    }
    public static void buscarVehiculo(List<Vehiculo> vehiculos, double minPrecio, double maxPrecio){
        boolean encontrado = false;
        System.out.println("Vehiculos en el rango de precio entre "+minPrecio+" y "+maxPrecio+" : ");
        for (Vehiculo vehiculo: vehiculos){
            if (vehiculo.getPrecio() >= minPrecio && vehiculo.getPrecio() <= maxPrecio){
                vehiculo.MostrarDetalles();
                encontrado = true;
            }
        }
        if (!encontrado){
            System.out.println("No hay vehiculos en el rango del precio especificado");
        }
    }
}