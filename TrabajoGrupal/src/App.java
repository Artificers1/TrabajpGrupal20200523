public class App {
    public static void main(String[] args) throws Exception {
        Animal perro = new Animal("Dinosaurio", "Carnivoro", 4);

        System.out.println("Su nombre es: "+perro.getNombre());
        System.out.println("Su Orden es: "+perro.getOrden());
        System.out.println("Sus Extremidades son: "+perro.getExtremidades());
        
    }

}
