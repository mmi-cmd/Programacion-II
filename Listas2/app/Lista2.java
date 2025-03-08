package app;

import java.util.Stack;

public class Lista2 {
    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>(); //no se usan con datos primitivos, solo con enteros

        stack.push(10);  // Push paqra añadir datos --> Ultimo dato
        stack.push(20);
        stack.push(30);
        stack.push(40); // Primer dato

        System.out.println(
            stack.peek() //Trae el ultimo elemnto que entró (40)
        );

        stack.pop(); // Borrar el ultimo dato

        System.out.println(
            stack.isEmpty() //preguntar si la lista esta vacía
        );

        

    }
}
