package sucursales;

public class Sucursal {
    protected int documentoCliente;
    protected String NombreCliente;
    protected double costo;

    public Sucursal(int documentoCliente, String NombreCliente, double costo) {
        this.documentoCliente = documentoCliente;
        this.NombreCliente = NombreCliente;
        this.costo = costo;
    }

    public int getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(int documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        NombreCliente = nombreCliente;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double calcularFactura (double costo){
        return 0.0;
    }

    public void imprimirFactura(){
        System.out.println("Documento Cliente: " + documentoCliente);
        System.out.println("Nombre Cliente: " + NombreCliente);
        System.out.println("Costo: " + costo);
    }
}
