package Module9Interface;

public class MainApp2Boxing {
    
    public static void main(String[] args) {
        
        // TYPY OPAKOWUJĄCE

        Byte b;
        Short s;
        Integer i;
        Long l;
        Float f;
        Double d;
        Character c;
        Boolean bl;

        int number = 10;

        // TEGO PONIŻEJ JUŻ SIĘ RACZEJ NIE UŻYWA
        // Integer intNumber = new Integer(10);

        // ZAMIAST TEGO LEPIEJ UŻYĆ
        // AUTO BOXING
        Integer intNumber = Integer.valueOf(10);
        Integer intNumber2 = 10;

        System.out.println(intNumber);
        System.out.println(intNumber2);

        Double dbl = new Double(3.10);

        // AUTO UNBOXING
        int newNumber = intNumber.intValue();

        // ZAPAMIĘTAJ - CZASEM ZAMIAST TYPU PROSTEGO, 
        // NIEZBĘDNE JEST UŻYCIE TYPU REFERENCYJNEGO
        // NP. W KOLEKCJACH
        // List<int> numbers = new ArrayList<>();
        
    }

}
