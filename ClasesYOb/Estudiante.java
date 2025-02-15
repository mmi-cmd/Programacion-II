public class Estudiante extends Persona {
    
    double notas;

    public Estudiante(String nombre, int edad, double notas) {
        super(nombre, edad);
        this.notas = notas;
    }

    @Override
    public void decirNombre(){
        System.out.println("Me llamo " + super.nombre + " y mi nota es " + this.nombre); //sobreescribir el metodo para que salga un mensaje distinto
    }
    
}
