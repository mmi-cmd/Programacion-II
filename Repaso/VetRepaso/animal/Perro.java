package animal;

import servicio.Servicio;

public class Perro extends Mascota {
    private boolean isGuarderia;

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    public boolean isGuarderia() {
        return isGuarderia;
    }

    public void setGuarderia(boolean isGuarderia) {
        this.isGuarderia = isGuarderia;
    }

    @Override
    public boolean tieneServicio(int idServicio) {
        return idServicio != 4 && !this.isGuarderia; //retorna true si el idServicio es diferente de 4 ya que no puede recibir atención domiciliaria y si no está en guardería
    }

    @Override
    public double calcularTotalServicios(Servicio servicio) {
        if ("Guardería".equals(servicio.getNombreServicio())) { //Si el servicio es guardería se activa la variable isGuarderia
            this.isGuarderia = true;
            System.out.println("El perro está en guardería");
    }
    return servicio.getPrecioServicio();
    }
    
}
