public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    static class Animal {
        //Propiedades privadas
        private String nombre;
        private String orden;
        private int extremidades;
    
        //constructor vacío para inicializar
        public Animal() {
        }
    
        //constructor con parámetros
        public Animal(String nombre, String orden, int extremidades) {
            this.nombre = nombre;
            this.orden = orden;
            this.extremidades = extremidades;
        }
    
    }
}
