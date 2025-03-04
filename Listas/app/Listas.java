package app;

import java.util.ArrayList;
import java.util.List;

import persona.Persona;

public class Listas {
    public static void main(String[] args) {
        /* List<String> nombres = new ArrayList<>();
        
        nombres.add("Juan");
        nombres.add("Geraldine");
        nombres.add("Julian");

        System.out.println(nombres.get(0));

        nombres.remove(2);

        System.out.println(nombres);

        for (String n : nombres) { //Para arraylist es más util usar for each
            System.out.println("Nombre: "+ n);
        } 

        System.out.println("--------------------");

        System.out.println(nombres.size()); //se usa size en lugar de lenght

        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }

        nombres.add("Jose");
        nombres.add("Sandrid");
        nombres.add("Euder");

        System.out.println(nombres.contains("Geraldine"));

        nombres.remove("Juan"); //remove sirve con el indicador o con el dato directamente

        nombres.add(3, "Salonme"); //Para agregar donde se desee, se indica la posicion y el valor

        nombres.set(3, "Salome"); //Para corregir un elemnto que desee

        System.out.println(nombres);

        nombres.clear(); //Borrar o eliminar la lista

        System.out.println(nombres); */
        

        List<Persona> nombres = new ArrayList<>();

        nombres.add(new Persona("Juan"));
        nombres.add(new Persona("Jose"));
        nombres.add(new Persona("Julian"));
        nombres.add(new Persona("Pedro"));
        nombres.add(new Persona("Maria"));
        

        System.out.println("--------------------");
        

        for (Persona persona : nombres) {
            System.out.println(persona.getNombre());
        } 

    }
    
}