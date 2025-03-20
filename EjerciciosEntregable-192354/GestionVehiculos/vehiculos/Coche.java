package vehiculos;

public class Coche extends Vehiculo {
    
        private int numPuertas;

        public Coche(String marca, String modelo, int año, int numPuertas) {
            super(marca, modelo, año);
            this.numPuertas = numPuertas;
        }

        
}
