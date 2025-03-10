package cliente;

import java.util.ArrayList;

import mascotas.Mascota;

public class Cliente {
    private int id;
    private String nombre;
    private String direccion;
    private ArrayList<Mascota> mascotas;


    public Cliente(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion; //no lleva mascotas ya que el cliente se registra primero antes de las mascotas
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }
    public void setMascotas(Mascota mascota) {
        if (this.mascotas == null) { // Inicializa la lista solo cuando se usa
            this.mascotas = new ArrayList<>();
        }
        this.mascotas.add(mascota);
    }
    
    
}
