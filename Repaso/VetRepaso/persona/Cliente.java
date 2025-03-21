package persona;

import java.util.ArrayList;
import animal.Mascota;

public class Cliente {
    private int id;
    private String nombre;
    private String direccion;
    private ArrayList<Mascota> mascotas;


    public Cliente(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.mascotas = new ArrayList<Mascota>();
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


    public void setMascotas(Mascota mascota) { //Se modifica el set para que reciba un solo objeto de tipo Mascota y no un arrayList completo
        this.mascotas.add(mascota);  //Se agrega el objeto a la lista de mascotas del cliente
    } //Con este metodo se agrega una a una las mascotas del cliente

    
}
