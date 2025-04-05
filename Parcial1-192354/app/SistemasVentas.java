package app;

import java.util.ArrayList;
import java.util.Scanner;

import sucursales.SucursalNorte;
import sucursales.SucursalSur;

public class SistemasVentas {

    static ArrayList<SucursalSur> facturasSur = new ArrayList<SucursalSur>();
    static ArrayList<SucursalNorte> facturasNorte = new ArrayList<SucursalNorte>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        datosBase();

        System.out.println("Bienvenido al sistema de ventas");
        System.out.println();

        while (true) {
            System.out.println("Ingrese la opción que desea: ");
            System.out.println("1. Imprimir facturas");
            System.out.println("2. Total facturado en sucursal norte");
            System.out.println("3. Total facturado en sucursal sur");
            System.out.println("4. Total facturado en todas las sucursales");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    imprimirFacturas();
                    break;

                case 2:
                    totalFacturadoNorte();
                    break;

                case 3:
                    totalFacturadoSur();
                    break;

                case 4:
                    totalFacturado();
                    break;

                case 5:
                    System.out.println("Gracias por usar el sistema de ventas");
                    return;

                default:
                    System.out.println("Opción no válida");
                    break;
            }


        }
    }

    public static void datosBase(){
        facturasSur.add(new SucursalSur(123456, "Juan", 1000000));
        facturasSur.add(new SucursalSur(654321, "Pedro", 2000000));
        facturasSur.add(new SucursalSur(987654, "Maria", 3000000));
        facturasSur.add(new SucursalSur(456789, "Luis", 4000000));
        facturasSur.add(new SucursalSur(987654, "Ana", 5000000));

        facturasNorte.add(new SucursalNorte(123456, "Juan", 1000000));
        facturasNorte.add(new SucursalNorte(654321, "Pedro", 2000000));
        facturasNorte.add(new SucursalNorte(987654, "Maria", 3000000));
        facturasNorte.add(new SucursalNorte(456789, "Luis", 4000000));
        facturasNorte.add(new SucursalNorte(987654, "Ana", 5000000));
    }

    public static void imprimirFacturas(){
        System.out.println("Facturas Sur");
        for (SucursalSur factura : facturasSur) {
            System.out.println("--------------------");
            factura.imprimirFactura();
        }

        System.out.println();
        System.out.println("Facturas Norte");
        for (SucursalNorte factura : facturasNorte) {
            System.out.println("--------------------");
            factura.imprimirFactura();
        }
    }

    public static void totalFacturadoNorte(){
        double totalNorte = 0;
        for (SucursalNorte factura : facturasNorte) {
            totalNorte += factura.calcularFactura(factura.getCosto());
        }
        System.out.println("Total facturado en sucursal norte: " + totalNorte);
    } 

    public static void totalFacturadoSur(){
        double total = 0;
        for (SucursalSur factura : facturasSur) {
            total += factura.calcularFactura(factura.getCosto());
        }
        System.out.println("Total facturado en sucursal sur: " + total);
    }

    public static void totalFacturado(){
        double total = 0;
        for (SucursalSur factura : facturasSur) {
            total += factura.calcularFactura(factura.getCosto());
        }

        for (SucursalNorte factura : facturasNorte) {
            total += factura.calcularFactura(factura.getCosto());
        }
        System.out.println("Total facturado en todas las sucursales: " + total);
    }
}