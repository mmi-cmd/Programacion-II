public class Persona {
    
    String nombre;
    int edad;
    double peso;
    double altura;
    int distanciaRecorrida;

    

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void correr() {
        if ( edad <= 10 ) {
            this.distanciaRecorrida++;
        } else if(edad > 10 && edad < 30) {
            this.distanciaRecorrida += 5;
        } else {
            this.distanciaRecorrida += 3;
        }
    }

    public void decirDistanciaRecorrida(){
        System.out.println("Ha recorrido una distancia: " + this.distanciaRecorrida);
    }
}
