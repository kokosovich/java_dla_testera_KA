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
    System.out.println(names[0]);

    names[1] = "Marcin";
    System.out.println(names[1]);
    
    names[2] = "Asia";
    System.out.println(names[2]);
    
    names[3] = "Monika";
    System.out.println(names[3]);

    names[4] = "Tomek";
    System.out.println(names[4]);

    System.out.println(names[5]);
    
    }
}
