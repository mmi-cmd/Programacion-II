public class Docente extends Persona{
    double sueldo;

    /**
     * crear el objeto de docente
     * @param nombre : El nombre del docente
     * @param edad : la edad del docente
     * @param sueldo : el valor que gana el docente
     */
    public Docente(String nombre, int edad, double sueldo) {
        super(nombre, edad);
        this.sueldo = sueldo;
    }

    @Override
    public void decirNombre(){
        System.out.println("Hola! Soy " + super.nombre + " y gano " + this.sueldo);
    }
}

