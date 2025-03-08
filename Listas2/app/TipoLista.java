package app;
import java.util.LinkedList;
public class TipoLista {

    public static void main(String[] args) {
        
        LinkedList<String> nombres = new LinkedList<>();

        nombres.add("A");
        nombres.add("B");
        nombres.add("C");

        nombres.add(1, "A");

        System.out.println(
            nombres.get(2)
         );

        System.out.println(
            nombres.getFirst()
        );

        System.out.println(
            nombres.getLast()
        );


        System.out.println(
            nombres.removeFirst()
        );

    }
}