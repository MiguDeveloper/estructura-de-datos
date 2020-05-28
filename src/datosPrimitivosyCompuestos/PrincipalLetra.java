package datosPrimitivosyCompuestos;

public class PrincipalLetra {
    public static void main(String[] args) {
        LetraEnlazada palabra = new LetraEnlazada('h');
        palabra.siguiente = new LetraEnlazada('o');
        palabra.siguiente.siguiente = new LetraEnlazada('l');
        palabra.siguiente.siguiente.siguiente = new LetraEnlazada('a');

        LetraEnlazada letra = palabra;
        while (letra != null){
            System.out.print(letra.getLetra());
            letra = letra.siguiente;
        }
    }
}
