package sucursales;

public class SucursalNorte extends Sucursal{

    private double descuentoNorte = 0.30;

    public SucursalNorte(int documentoCliente, String NombreCliente, double costo) {
        super(documentoCliente, NombreCliente, costo);
    }

    public double getDescuentoNorte() {
        return descuentoNorte;
    }

    public void setDescuentoNorte(double descuentoNorte) {
        this.descuentoNorte = descuentoNorte;
    }

    @Override
    public double calcularFactura(double costo) {
        if (this.costo > 300000){
            return costo - (costo * descuentoNorte);
        }
        return costo;
    }
}
