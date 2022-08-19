package Module8Abstrakcja;

import Model.computer.Computer;
import Model.computer.Laptop;
import Model.computer.PC;

public class KlasaAbstrakcyjna {
    
    public static void main(String[] args) {
        
        // ABSTRAKCJA vs. KONKRETNE ROZWIĄZANIA

        Computer officeComputer = new PC("Office computer 1", "HP", 500, 128);
        Computer gamingLaptop = new Laptop("X GAME", "PRO", 500, 256, 100);
        
        // Computer computer = new Computer("aaa", "bbb", 1, 1);
        // nie można utworzyć obiektu klasy abstrakcyjnej
        System.out.println(gamingLaptop.volumeUp());
        System.out.println(officeComputer.volumeUp());

    }
}
