package libro;

public class Novela extends Libro {

    private String tipoNovela;

    public Novela(String titulo, String autor, int añoPublicacion, String tipoNovela) {
        super(titulo, autor, añoPublicacion);
        this.tipoNovela = tipoNovela;
    }

    
    
}
