package datosPrimitivosyCompuestos;

public class PrincipalDog {
    public static class Dog {
        private String name;

        public Dog(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Max");
        Dog oldDog = dog;

        foo(dog);

        dog.getName().equals("Max"); // true
        dog.getName().equals("Fili"); // false
        assert (dog == oldDog);
    }

    public static void foo(Dog d) {
        d.getName().equals("Max");// true
        // Cambiamos el valor del puntero, no el valor al que apunta el puntero
        d = new Dog("Fili");
        d.getName().equals("Fili");
    }
}
