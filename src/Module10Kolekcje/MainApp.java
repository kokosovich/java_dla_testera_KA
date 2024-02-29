package Module10Kolekcje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainApp {
    
    public static void main(String[] args) {
        
            // KOLEKCJA - ZBIÓR ELEMENTÓW TEGO SAMEGO TYPU -> ELEMENT1, ELEMENT2, ELEMENT3

        List<String> names = new ArrayList<>();
        List<String> names1 = new ArrayList<>();

        names.add("Bartek");
        names.add("Tomek");
        names.add("Marcin");
        names.add("Asia");

        names1.add("Bartek");
        names1.add("Asia");

        System.out.println(names);

        for (String name : names) {
            System.out.println(name);
        }

        // names.remove(0);
        // System.out.println(names);

        // names.remove("Marcin");
        // System.out.println(names);

        String name = names.get(1);
        System.out.println(name);

        System.out.println(names.size());

        System.out.println(names.isEmpty());

        System.out.println(names.contains("Asia"));

        // names.addAll(names1);
        // System.out.println(names);

        // names.removeAll(names1);
        // System.out.println(names);

        Collections.sort(names);
        System.out.println(names);

        Collections.reverse(names);
        System.out.println(names);


    }

}
