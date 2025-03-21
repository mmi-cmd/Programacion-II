package animal;

import servicio.Servicio;

public class Gato extends Mascota {
    private int cantidadAtencion;


    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }


    public int getCantidadAtencion() {
        return cantidadAtencion;
    }


    public void setCantidadAtencion(int cantidadAtencion) {
        this.cantidadAtencion = cantidadAtencion;
    }

    @Override
    public boolean tieneServicio(int idServicio) {
        return idServicio != 3; //retorna true si el idServicio es diferente de 3 ya que no puede recibir guardería
    }

    public double calcularTotalServicios(Servicio servicio) {
        if ("Atención domiciliaria".equals(servicio.getNombreServicio())) { //Si el servicio es atención a domicilio se activa la variable cantidadAtencion
            this.cantidadAtencion++;
            if (cantidadAtencion % 3 == 0) {
                System.out.println("¡Felicidades! El servicio de atención domiciliaria es gratis, gracias por preferirnos");
                return 0;
            } 
        }
        return servicio.getPrecioServicio();
    }
}
