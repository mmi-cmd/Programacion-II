package empleados;

public class Gerente extends Empleado {

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario, departamento);
    }

    @Override
    public double calcularSalario() {
        return salario * 1.5;
    }
    
}
