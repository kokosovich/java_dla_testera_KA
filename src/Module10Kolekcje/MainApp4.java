package Module10Kolekcje;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainApp4 {

    public static void main(String[] args) {
        
        // SET - ZBIÓR UNIKALNYCH ELEMENTÓW; NIE MA GWARANCJI KOLEJNOŚCI ELEMENTÓW W KOLEKCJI

        Set<String> names = new HashSet<>();
        names.add("Bartek");
        names.add("Marcin");
        names.add("Tomek");
        names.add("Jacek");
        names.add("Asia");
        names.add("Bartek"); // ZOSTANIE ZIGNOROWANE

        System.out.println(names.size());

        for (String name : names) {
            System.out.println(name);
        }

        // TREESET - PRZECHOWUJE UNIKALNE I POSORTOWANE

        Set<String> sortedNames = new TreeSet<>(names);

        for (String name : sortedNames) {
            System.out.println(name);
        }

    }
    
}
