package taquilla;
public class Ticket{
   private String pelicula; 
   private double precio;
   private boolean estado;

   

    public Ticket(String pelicula, double precio, boolean estado) {
    this.pelicula = pelicula;
    this.precio = precio;
    this.estado = estado;
}
    /**
     * 
     * @return this.pelicula
     */
    public String getPelicula(){
        return this.pelicula;
    }

    /**
     * 
     * @param pelicula
     */
    public void setPelicula(String pelicula){
        this.pelicula = pelicula;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public boolean getEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    public void getInfo(){
        System.out.println(this.pelicula + ","+ this.precio + this.estado);
    }
}