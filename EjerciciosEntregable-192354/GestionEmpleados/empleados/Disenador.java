package empleados;

public class Disenador extends Empleado {

    public Disenador(String nombre, double salario, String departamento) {
        super(nombre, salario, departamento);
    }

    @Override
    public double calcularSalario() {
        return salario * 1.2;
    }
    
}
