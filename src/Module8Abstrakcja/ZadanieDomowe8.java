package Module8Abstrakcja;

import Model.computer.Computer;
import Model.computer.Laptop;
import Model.computer.PC;

public class ZadanieDomowe8 {

    public static void main(String[] args) {

        // 1. stworzyć 2 metody abstrakcyjne w klasie Computer: volumeUp (max 100
        // volume) i volumeDown (min 0 volume)
        // 2. zaimplementować te metody w klasie PC i Laptop: metody przeciążone, będą
        // przyjmowały parametr int
        // wartość int będzie zwiększać i zmniejszać volume

        Computer officeComputer = new PC("Office computer 1", "HP", 500, 128);
        Computer gamingLaptop = new Laptop("X GAME", "PRO", 500, 256, 100);

        System.out.println(officeComputer.volumeUp(5));
        System.out.println(officeComputer.volumeUp(50));
        System.out.println(officeComputer.volumeUp(50));
        System.out.println(officeComputer.volumeDown(200));

        System.out.println(gamingLaptop.volumeUp(150));
        System.out.println(gamingLaptop.volumeDown(10));
        System.out.println(gamingLaptop.volumeDown(30));
        System.out.println(gamingLaptop.volumeDown(90));

    }

}
