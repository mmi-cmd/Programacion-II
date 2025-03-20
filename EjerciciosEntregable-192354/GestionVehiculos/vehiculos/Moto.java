package vehiculos;

public class Moto extends Vehiculo {
    
    private int cilindrada;

    public Moto(String marca, String modelo, int año, int cilindrada) {
        super(marca, modelo, año);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    

}
