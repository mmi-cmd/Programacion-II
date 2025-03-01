package App;

import java.util.Arrays;

public class Arreglos {

    public static void main(String[] args) {
    /* String nombres [][] = new String[2][3]; //Se declara como objeto

    nombres[0][0] = "A";
    nombres[0][1] = "B";
    nombres[0][2] = "C";
    nombres[1][0] = "D";
    nombres[1][1] = "E";
    nombres[1][2] = "F";

   for (int i = 0; i < nombres.length; i++) {
        System.out.println(i + " - " + nombres[i]);
    } 
 
        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres[i].length; j++) {
                System.out.print( nombres[i][j] + " ");
            }
            System.out.println();
        }*/

        int [] numeros = {1, 2, 3, 4, 50, 6, 7, 8, 9, 10};

        double promedio = 0;
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        System.out.println("El promedio es: " + suma/numeros.length);

        //Métodos de arrays

        int max = Arrays.stream(numeros).max().orElse(0); //or else en caso de que no enceuntre nada, agregue cero, evitando errores
        System.out.println("Máximo: " + max);

        int min = Arrays.stream(numeros).min().orElse(0);
        System.out.println("Máximo: " + min);

        promedio = Arrays.stream(numeros).average().orElse(0);
        System.out.println(promedio);

        //alteraciones a un array

        int[] numeroDos = Arrays.stream(numeros).map(n -> n*2).toArray();

        for (int i = 0; i < numeroDos.length; i++) {
            System.out.println(numeroDos[i]);
        }

    } 
}