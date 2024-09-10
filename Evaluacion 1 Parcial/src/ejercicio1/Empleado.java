package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    Empleado (String nombre, int edad, double salario){
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }
    public void aplicarAumento(){
        if (salario < 3000){
            System.out.println("Recibiste un aumento del 10%, Felicidades");
            salario *= 1.10;
        } else if (salario > 3000) {
            System.out.println("No califica para el aumento, Gracias");
        }
    }
    @Override
    public String toString (){
        return " Empleado "+" Nombre = "+ nombre + '/' +" Edad = "+ edad +'/' +" Salario = "+ salario;
    }
}
class main {
    public static void main (String[]args){
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Carlos", 18 , 2500));
        empleados.add(new Empleado("Juan Jose", 19 , 3200));
        empleados.add(new Empleado("Hugo", 27 , 2900));

        for (Empleado empleado : empleados){
            empleado.aplicarAumento();
        }

        for (Empleado empleado : empleados){
            System.out.println(empleado);
        }
    }
}
