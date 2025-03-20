package empresa;

import java.util.ArrayList;
import java.util.Scanner;

import empleados.Desarrollador;
import empleados.Disenador;
import empleados.Empleado;
import empleados.Gerente;

public class Empresa {

    static ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Bienvenido a la empresa");

        while (true) {
            System.out.println("Seleccione una opción");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Mostrar empleados");
            System.out.println("3. Calcular nómina total");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch(opcion){
                case 1:
                    agregarEmpleado();
                    break;
                case 2:
                    mostrarEmpleados();
                    break;
                case 3:
                    calcularNominaTotal();
                    break;
                case 4:
                    System.out.println("Hasta luego");
                    return;
                default:
                    System.out.println("Opción no válida");

                }
                
                System.out.println("¿Desea realizar otra operación? (1. si / 2. no)");
                int continuar = scanner.nextInt();
                scanner.nextLine();
                if(continuar == 2){
                    System.out.println("Gracias por usar el sistema");
                    break;
                }
            }
    }

    public static void agregarEmpleado(){
        System.out.println("Ingresa el nombre del empleado");
        String nombre = scanner.nextLine();
        System.out.println("Ingresa el salario del empleado");
        double salario = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Ingresa el departamento del empleado");
        String departamento = scanner.nextLine();
        System.out.println("Ingresa el tipo de empleado (1. Gerente, 2. Desarrollador, 3. Diseñador)");
        int tipo = scanner.nextInt();
        scanner.nextLine();
        switch(tipo){
            case 1:
                empleados.add(new Gerente(nombre, salario, departamento));
                break;
            case 2:
                empleados.add(new Desarrollador(nombre, salario, departamento));
                break;
            case 3:
                empleados.add(new Disenador(nombre, salario, departamento));
                break;
            default:
                System.out.println("Tipo de empleado no válido");
        }
        System.out.println("Empleado agregado correctamente");
    }


    public static void mostrarEmpleados(){
        for(Empleado empleado : empleados){
            System.out.println("--------------------");
            empleado.mostrarDatos();
        }
    }

    public static void calcularNominaTotal(){
        double nominaTotal = 0;
        for(Empleado empleado : empleados){
            nominaTotal += empleado.calcularSalario();
        }
        System.out.println("La nómina total es: " + nominaTotal);
    }
    
}