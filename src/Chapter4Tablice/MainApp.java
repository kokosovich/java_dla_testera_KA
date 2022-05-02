package Chapter4Tablice;

public class MainApp {

    public static void main(String[] args) {

        // 1. Tablice - zbiór danych tego samego typu
        // 2. Zawsze musisz określić rozmiar tablicy
        // 3. Ostatni element - długość tablicy -1
        // 4. [] - tablica
        // 5.  int[] numbers = new int[10]

        String[] names = new String[5];

        // wartości tablicy ["Bartek", "Marcin", "Asia", "Monika", "Tomek"]
        // index tablicy    [   0,        1,        2,       3,        4  ]

        names[0] = "Bartek";
        names[1] = "Marcin";
        names[2] = "Asia";
        names[3] = "Monika";
        names[4] = "Tomek";

        // for(licznik; warunek; zmiana licznika)

        for(int i = 0; i < names.length; i++) {
            if (i % 2 == 0) {
                System.out.println(names[i]);
            }
        }
    
        // for each - zawsze przechodzi przez wszystkie elementy tablicy

        for (String name : names) {
            System.out.println(name);            
        }

    }
}
