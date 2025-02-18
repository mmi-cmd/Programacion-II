import taquilla.Ticket;

public class App {
    public static void main(String[] args) throws Exception {
        Ticket ticket = new Ticket("Infinity wars", 10000, true); //Se necesita importar debido a que esta en un paquete por encapsulamiento
    
        ticket.getInfo();

        ticket.setPelicula("Mi pobre angelito"); //cambio nombre

        String nombrePelicula = ticket.getPelicula(); //Obtengo el nuevo nombre

        System.out.println(nombrePelicula);
    
    }
}
