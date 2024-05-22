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
   
    @Override
    void registrar() {
        System.out.println("Registro del empleado: " + nombre);
      
    }

   
    @Override
    double calcularSueldo() {
        double sueldoTotal = salarioBase + (horasExtras * pagoPorHoraExtra);
        return sueldoTotal;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public double getPagoPorHoraExtra() {
        return pagoPorHoraExtra;
    }
}

