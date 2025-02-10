import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SueldoEmpleado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de empleados del mes: ");
        int cantidadEmpleado = scanner.nextInt();
        scanner.nextLine();

        String nombre;
        int dia;
        double pago;
        double pagoTotal;
        String categoria;

        ArrayList<String> reporte = new ArrayList<>();

        for (int i = 0; i < cantidadEmpleado; i++) {
            
            System.out.print("Ingrese el nombre del empleado: ");
            nombre = scanner.nextLine();

            System.out.print("Ingrese el numero de dias trabajados : ");
            dia = scanner.nextInt();

            System.out.print("Ingrese el pago diario: ");
            pago = scanner.nextDouble();
            scanner.nextLine();

            pagoTotal = dia * pago;

            if (dia>20) {
                pagoTotal += (pagoTotal*0.20);
            } else if (dia<10) {
                pagoTotal -= (pagoTotal*0.10);
            }


            if (pagoTotal>1000000) {
                categoria = "Sueldo alto";
            } else if (pagoTotal>= 10000 && pagoTotal <= 1000000) {
                categoria = "Sueldo medio";
            } else{
                categoria = "Sueldo bajo";
            }

            reporte.add(nombre + " | $" + pagoTotal + " | " + categoria);
        }

        System.out.println("------------------------------------------------");
        System.out.println("Resumen de la nomina");
        System.out.println("------------------------------------------------");
        System.out.println("Nombre | Sueldo | Categoría");
        System.out.println("------------------------------------------------");
        for (String r : reporte) {
            System.out.println(r);
        }
        System.out.println("------------------------------------------------");
    }
}