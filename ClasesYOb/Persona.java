public class Persona {
    
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void cumplirAnyos(){
        this.edad++;
        System.out.println("Cumple " + this.edad);
    }

    public void decirNombre(){
        System.out.println("Mi nombre es " + this.nombre);
    }
}
