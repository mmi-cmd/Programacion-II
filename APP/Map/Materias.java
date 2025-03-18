package app;

import java.util.HashMap;
import java.util.Map;

public class Materias {
    public static void main(String[] args) {

        Map <Integer, String> materias = new HashMap<>();
        Map <Integer, String> materias2 = new HashMap<>();

        materias.put(192450, "Calculo");
        materias.put(192451, "Programacion");
        materias.put(192452, "Estadistica");
        materias.put(192453, "Desarrollo");

        System.out.println("------------Materias 1----------------- ");


        for (String mat : materias.values()) {
            System.out.println(mat);
        }


        materias2.put(192454, "Proyecto Integrador");
        materias2.put(192455, "Electro");
        materias2.put(192456, "Fisica");
        materias2.put(192457, "Álgebra");

        
        System.out.println("---------------Materias 2 ------------- ");

        for (String mate : materias2.values()) {
            System.out.println(mate);
        }

    
        System.out.println("-----------Materias unidas-------------- ");
        materias.putAll(materias2);

        for (String todo : materias.values()) {
            System.out.println(todo);
        }

        System.out.println(materias.entrySet());

    }
    
    
}
