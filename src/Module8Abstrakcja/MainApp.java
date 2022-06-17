package Module8Abstrakcja;

import Model.computer.Computer;
import Model.computer.Laptop;
import Model.computer.PC;

public class MainApp {

    public static void main(String[] args) {

        // POLIMORFIZM - wiele form

        PC officeComputer1 = new PC("Office computer 1", "HP", 500, 128);
        Computer officeComputer2 = new PC("Office computer 2", "HP", 500, 128);
        Computer officeComputer3 = new PC("Office computer 3", "HP", 500, 128);
        Computer gamingLaptop = new Laptop("XGames", "HP GAMES", 500, 256, 50);
        Computer macbook = new Laptop("MB PRO", "PRO", 500, 256, 100);

        // przykładowe referencje do obiektu

        int[] array = { 1, 2, 3 };
        System.out.println(array);
        System.out.println(officeComputer1);
        System.out.println(officeComputer2);
        System.out.println(officeComputer3);
        System.out.println(gamingLaptop);
        System.out.println(macbook);
        System.out.println("-----");

        // a gdyby admin chciał wyłączyć wszystkie komputery
        
        Computer[] computers = { officeComputer1, officeComputer2, officeComputer3, gamingLaptop, macbook };

        for (Computer computer : computers) {
            computer.switchOff();
        }

        officeComputer1.showComputerName();

        // rzutowane typów
        
        ((PC)officeComputer2).showComputerName();

    }
}
