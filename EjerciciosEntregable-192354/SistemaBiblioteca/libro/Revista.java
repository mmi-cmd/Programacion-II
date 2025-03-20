package libro;

public class Revista extends Libro{

    private String tipoRevista;

    public Revista(String titulo, String autor, int añoPublicacion, String tipoRevista) {
        super(titulo, autor, añoPublicacion);
        this.tipoRevista = tipoRevista;
    }

    public String getTipoRevista() {
        return tipoRevista;
    }

    public void setTipoRevista(String tipoRevista) {
        this.tipoRevista = tipoRevista;
    }

    
    
}
