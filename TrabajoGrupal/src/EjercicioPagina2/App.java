package EjercicioPagina2;

public class App {
    public static void main(String[] args) throws Exception {
        // Creación de un objeto Empleado
        Empleado empleado = new Empleado("Juan Pérez", 1000.0, 10, 15.0);

        // Registro del empleado
        empleado.registrar();

        // Cálculo del sueldo del empleado
        double sueldo = empleado.calcularSueldo();
        System.out.println("El sueldo total de " + empleado.getNombre() + " es: " + sueldo);
    }
}
