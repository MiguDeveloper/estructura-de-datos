package datosPrimitivosyCompuestos;

public class LetraEnlazada {
    private char letra;

    public LetraEnlazada(char letra) {
        this.letra = letra;
    }

    public char getLetra() {
        return letra;
    }

    LetraEnlazada siguiente;

}
