package acudiente;

import java.util.ArrayList;

import estudiantes.Nino;

public class Acudiente {
    private String nombre;
    private int edad;
    private int documento;
    private ArrayList<Nino> ninos;
    
    public Acudiente(String nombre, int edad, int documento) {
        this.nombre = nombre;
        this.edad = edad;
        this.documento = documento;
        this.ninos = new ArrayList<Nino>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public void setNinos(Nino nino) {
        this.ninos.add(nino);
    }

    public ArrayList<Nino> getNinos() {
        return ninos;
    }

    
    
}
