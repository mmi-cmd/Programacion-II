package libro;

public class LibroTexto extends Libro {

    private String tipoTexto;

    public LibroTexto(String titulo, String autor, int añoPublicacion, String tipoTexto) {
        super(titulo, autor, añoPublicacion);
        this.tipoTexto = tipoTexto;
    }

    
    
}
