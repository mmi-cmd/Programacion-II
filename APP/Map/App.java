package app;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        Map <String, Integer> skills = new HashMap<>();
        Map <String, Integer> skills2 = new HashMap<>();

        skills.put("Power", 80); //para agregar datos
        skills.put("Jump", 50);
        skills.put("Regate", 90);

        skills2.put("aaa", 5); 
        skills2.put("sss", 1);

        System.out.println(
            skills.get("Power") //Buscar con llave
        );
         

        System.out.println(skills);

        System.out.println(
            skills.containsKey("Regate") //Resultado boolean
        );

        System.out.println(
            skills.containsValue(50) //Resultado boolean
        );


        for (String key : skills.keySet()) { //recorrer claves con método propio keySet()
            System.out.println(key);
        }

        for (Integer value : skills.values()) { //recorrer valores con método propio values()
            System.out.println(value);
        }

        System.out.println(skills.entrySet()); //método para sacar los valores del map en un arreglo

        skills.remove("Power"); //Elimina key y value

        System.out.println(skills);

        skills.remove("Jump", 20); //Elimina todo si encuentra exacatamente los mismo valores

        System.out.println(skills);

        System.out.println(skills.isEmpty()); //Verificar si está vacío
    
        /* skills.clear(); //limpiar todo */

        skills.putAll(skills2); //Fusionar dos maps

        System.out.println(skills);


    }
    
}