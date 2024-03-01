package Module9Interface;

import Model.computer.Computer;
import Model.computer.Hdd;
import Model.computer.Laptop;
import Model.computer.Ram;

public class MainApp4hasA {

    public static void main(String[] args) {

        // 1. IS A - JEST CZYMŚ - DZIEDZICZENIE
        // 2. HAS A - POSIADA COŚ, SKŁADA SIĘ Z CZEGOŚ - KOMPOZYCJA

        Hdd hdd = new Hdd("Samsung", 500);
        Ram ram = new Ram("AAA", 128);

        // 1-SZY SPOSÓB TWORZENIA OBIEKTÓW
        Computer mac = new Laptop("Mac", "Pro", hdd, ram, 100);

        // 2-GI SPOSÓB TWORZENIA OBIEKTÓW
        Computer mac1 = new Laptop("Mac", "Pro", hdd, new Ram("AAA", 128), 100);

        System.out.println(mac.getRam().getSize());
        System.out.println(mac1.getRam().getSize());

    }

}
