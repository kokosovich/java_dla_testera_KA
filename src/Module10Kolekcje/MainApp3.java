package Module10Kolekcje;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainApp3 {

    public static void main(String[] args) {

        // KOLEKCJA - ZBIÓR ELEMENTÓW TEGO SAMEGO TYPU -> ELEMENT1, ELEMENT2, ELEMENT3

        // ArrayList - KAŻDY ELEMENT MA SWÓJ INDEKS
        // [ELEMENT1, ELEMENT2, ELEMENT3]
        // [ 0 1 2 ]

        // LinkedList - KAŻDY ELEMENT ZNA SWOJEGO SĄSIADA
        // [ELEMENT1 <-> ELEMENT2 <-> ELEMENT3 <-> ELEMENT4]

        List<String> names1 = new ArrayList<>();
        List<String> names2 = new LinkedList<>();

        names1.add("Bartek");
        names2.add("Bartek");

        names1.get(0);
        names2.get(0);

        names1.remove(0);
        names2.remove(0);

    }

}
