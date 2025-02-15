public class Cuenta {
    String titular;
    double cantidad;

    public Cuenta (String titular){
        this.titular = titular;

    }

    public Cuenta (String titular, double cantidad){
        this.titular = titular;
        this.cantidad= cantidad;

    }

    public void ingresar(double cantidad){
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    public void retirar(double cantidad){
        double resta = this.cantidad - cantidad;

        /* if (resta<0) {
            this.cantidad = 0;
        } else{
            this.cantidad = resta;
        } */

        this.cantidad = (resta < 0) ? 0 : resta;
    }

    public void imprimir(){
        System.out.println("Su cantidad actual es: " + this.cantidad);
    }

}
