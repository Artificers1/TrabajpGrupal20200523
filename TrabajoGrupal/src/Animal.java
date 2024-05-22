public class Animal {

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

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getOrden() {
            return orden;
        }

        public void setOrden(String orden) {
            this.orden = orden;
        }

        public int getExtremidades() {
            return extremidades;
        }

        public void setExtremidades(int extremidades) {
            this.extremidades = extremidades;
        }
    
    

}
