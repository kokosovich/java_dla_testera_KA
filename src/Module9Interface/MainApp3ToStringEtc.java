package Module9Interface;

import Model.User;

public class MainApp3ToStringEtc {

    public static void main(String[] args) {
        
        User bartek = new User("Bartek", "Testowy", "b@t.pl", 20);
        User bartek1 = new User("Bartek1", "Testowy", "b@t.pl", 20);

        System.out.println(bartek); // TU JEST UŻYWANA METODA toString()
        // JEŻELI KLASA NIE DZIEDZICZY PO ŻANDEJ KLASIE
        // TO ZAWSZE W UKRYCIU DZIEDZICZY PO SUPERKLASIE Object
        // STĄD OVERRIDE PRZY METODZIE toString()

        System.out.println(bartek.equals(bartek1));

    }
    
}
