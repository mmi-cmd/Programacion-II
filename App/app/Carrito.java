package app;

import java.util.ArrayList;

import productos.Producto;

public class Carrito {
    private ArrayList<Producto> lista;
    private double total;


    public Carrito(){ //Constructor sin parametros
        this.lista = new ArrayList<>();
        this.total = 0;
    }

    public void addProduct(Producto producto){
        lista.add(producto);
        System.out.println("Producto agregado correctamente");
        total += producto.getPrecio();
    }
    

}
