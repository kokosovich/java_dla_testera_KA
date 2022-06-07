package Module7Dziedziczenie;

import Model.computer.PC;
import Model.computer.Laptop;

public class MainApp {

    public static void main(String[] args) {

        // 1. IS A - jest czymś - DZIEDZICZENIE
        // 2. HAS A - posiada coś - KOMPOZYCJA

        // "Hej Mamo - jesteś super!" - słówko super w dziedziczeniu

        PC officeComputer = new PC("Office computer", "HP", 500, 128);

        Laptop gamingLaptop = new Laptop("XGames", "HP GAMES", 500, 256);

        officeComputer.switchOn();
        System.out.println(officeComputer.getState());

        gamingLaptop.switchOn();
        System.out.println(gamingLaptop.getState());

        officeComputer.showComputerName();

    }
}
