package salas;

public class Sala {
    private String nombre;
    private String peliculaDiurna;
    private String peliculaNocturna;
    private String beneficio;
    private boolean[][] asientosDiurnos;
    private boolean[][] asientosNocturnos;

    public Sala(String nombre, String peliculaDiurna, String peliculaNocturna, String beneficio, int filas, int columnas) {
        this.nombre = nombre;
        this.peliculaDiurna = peliculaDiurna;
        this.peliculaNocturna = peliculaNocturna;
        this.beneficio = beneficio;
        this.asientosDiurnos = new boolean[filas][columnas]; //Se inicializa el array con filas y columnas
        this.asientosNocturnos = new boolean[filas][columnas];
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPeliculaDiurna() {
        return peliculaDiurna;
    }

    public void setPeliculaDiurna(String peliculaDiurna) {
        this.peliculaDiurna = peliculaDiurna;
    }

    public String getPeliculaNocturna() {
        return peliculaNocturna;
    }

    public void setPeliculaNocturna(String peliculaNocturna) {
        this.peliculaNocturna = peliculaNocturna;
    }


    public String getBeneficio() {
        return beneficio;
    }



    public void mostrarAsiestos(int horario){
        boolean[][] asientos = (horario == 0) ? asientosDiurnos : asientosNocturnos;

        System.out.println("Mapa de asiestos: [D] = Disponible / [N] = NO Disponible  ");
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) { //Se imprimen los asientos con un for anidado
                System.out.print(asientos[i][j] ? "[N]" : "[D]" ); // False para las no reservadas, true para las ocupadas
            }
            System.out.println();
        }
    }

    int boletosVendidos = 0;
    int recaudacion = 0;
    public boolean reservarAsientos(int horario, int fila, int columna){

        boolean[][] asientos = (horario == 0) ? asientosDiurnos : asientosNocturnos;

        if ((fila >= 0 && fila < asientos.length) && (columna >= 0 && columna < asientos[0].length)) {
            if (!asientos[fila][columna]) { //false para asiento libre, true para asiento ocupado, si el asiento no está ocupado (igual a false) se puede seleccionar
                asientos[fila][columna] = true;
                boletosVendidos++;
                recaudacion+=30000;
                return true;
            }
        }
        return false;
    }

    public void mostrarInforme(){
        System.out.println("-----------------Reporte del cine-------------------");
        System.out.println("Sala: " + this.nombre);
        System.out.println("Boletos vendidos: " + boletosVendidos);
        System.err.println("Recaudación: " + recaudacion);
        System.out.println("------------------------------------");
    }


}
