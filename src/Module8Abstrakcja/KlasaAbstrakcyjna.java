package Module8Abstrakcja;

import Model.computer.Computer;
import Model.computer.Laptop;
import Model.computer.PC;

public class KlasaAbstrakcyjna {

    public static void main(String[] args) {

        // ABSTRAKCJA vs. KONKRETNE ROZWIĄZANIA

        // 1. NIE MOŻNA UTWORZYĆ OBIEKTU KLASY ABSTRAKCYJNEJ
        // 2. JEŻELI KLASA POSIADA PRZYNAJMNIEJ JEDNĄ METODĘ ABSTRAKCYJNĄ, TO CAŁA KLASA
        // TEŻ MUSI BYĆ ABSTRAKCYJNE
        // 3. KLASY DZIEDZICZĄCE MUSZĄ(!!!) NADPISAĆ WSZYSTKIE METODY ABSTRAKCYJNE Z
        // ABSTRAKCYJNEJ KLASY MATKI

        Computer officeComputer = new PC("Office computer 1", "HP", 500, 128);
        Computer gamingLaptop = new Laptop("X GAME", "PRO", 500, 256, 100);

        System.out.println(officeComputer.volumeUp());
        System.out.println(officeComputer.volumeUp());

        System.out.println(officeComputer.volumeDown());
        System.out.println(officeComputer.volumeDown());
        System.out.println(officeComputer.volumeDown());

        System.out.println(gamingLaptop.volumeUp());

        System.out.println(gamingLaptop.volumeDown());
        System.out.println(gamingLaptop.volumeDown());
        System.out.println(gamingLaptop.volumeDown());
        System.out.println(gamingLaptop.volumeDown());
        System.out.println(gamingLaptop.volumeDown());
        System.out.println(gamingLaptop.volumeDown());

    }
}
