package Module10Kolekcje;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainApp6 {
    
    public static void main(String[] args) {
        
        // MAPA - ZBIÓR + WARTOŒÆ

        Map<Integer, String> names = new HashMap<>();
        
        names.put(1, "Bartek1");
        names.put(10, "Bartek10");
        names.put(20, "Bartek20");
        names.put(0, "Bartek0");
        names.put(5, "Bartek5");
        names.put(20, "Bartek222"); // U¯YCIE TEGO SAMEGO KLUCZ NADPISUJE

        System.out.println(names);

        // TREEMAP - SORTUJE KLUCZE
        Map<Integer, String> sortedNames = new TreeMap<>(names);
        System.out.println(sortedNames);

        // LINKEDHASHMAP - UTRZYMUJE KOLEJNOŒÆ DODAWANIA ELEMENTÓW
        Map<Integer, String> linkedNames = new LinkedHashMap<>(names);
        System.out.println(linkedNames);

        // WYŒWIETLANIE KLUCZY I WARTOŒCI Z MAPY
        for (Map.Entry<Integer, String> entry: names.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
