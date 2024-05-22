package EjercicioPagina2;

public class Empleado extends Persona {
    private String nombre;
    private double salarioBase;
    private int horasExtras;
    private double pagoPorHoraExtra;

    public Empleado(String nombre, double salarioBase, int horasExtras, double pagoPorHoraExtra) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
        this.pagoPorHoraExtra = pagoPorHoraExtra;
    }
    
}
