package datosPrimitivosyCompuestos;

public class Principal {
    public static void main(String[] args) {
        int a = 1;
        int b = a;
        System.out.println(a);
        System.out.println(b);

        a = 2;
        System.out.println(a);
        System.out.println(b);

        int[] lista1 = new int[10];
        int[] lista2 = lista1;

        lista1[1] = 2;

        System.out.println(lista1[1]);
        System.out.println(lista2[1]);

    }
}
