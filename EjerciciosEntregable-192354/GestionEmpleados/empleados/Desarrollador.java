package empleados;

public class Desarrollador extends Empleado {

    public Desarrollador(String nombre, double salario, String departamento) {
        super(nombre, salario, departamento);
    }

    @Override
    public double calcularSalario() {
        return salario * 1.3;
    }
    
}
