package sucursales;

public class SucursalSur extends Sucursal {
    private double descuentoSur = 0.10;

    

    public SucursalSur(int documentoCliente, String NombreCliente, double costo) {
        super(documentoCliente, NombreCliente, costo);
    }

    public double getDescuentoSur() {
        return descuentoSur;
    }

    public void setDescuentoSur(double descuentoSur) {
        this.descuentoSur = descuentoSur;
    }

    @Override
    public double calcularFactura(double costo) {
        return costo - (costo * descuentoSur);
    }
}
