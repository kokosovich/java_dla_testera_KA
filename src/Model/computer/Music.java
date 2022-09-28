package Model.computer;

public interface Music {

    // METODY - ZACHOWANIE

    // 1. NIE MOŻNA DODAWAĆ PÓL OBIEKTU
    // 2. MOŻNA TWORZYĆ TYLKO STAŁE - DOMYŚLNIE public static final

    String NAME = "MUSIC";

    // 3. TYLKO METODY ABSTRAKCYJNE - DOMYŚLNIE public abstract

    void playMusic();
    void pauseMusic();
    void stopMusic();

    // OD JAVA 8
    // 4. METODY DOMYŚLNE - ZWYKŁE METODY

    default void sayHelloFromMusic() {
        System.out.println("Hello from default music");
    }

    // 5. METODY STATYCZNE
    
    static String getName() {
        return NAME;
    }

    // OD JAVY 9
    // 6. PRYWATNE STATYCZNE METODY

    private static void privateMethod() {
        System.out.println("Hello from private method");
    }
    
}