package datosPrimitivosyCompuestos;

import java.util.ArrayList;

public class Listas {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        System.out.println(lista.size());
        addToList(lista);
        System.out.println(lista.size());
    }

    public static void addToList(ArrayList<String> lista){
        lista.add("hola");
    }
}
