public class MainApp {

    public static void main(String[] args) {
        // co to jest klasa i z czego się składa

        // typ nazwa = nowy obiekt
        User bartek = new User("Bartek", "Testowy", "bartek@test.pl", 17); // wywołanie konstruktora
        bartek.getAllInfo();

        User tomek = new User("Tomek", "Smith", "tomek@test.pl", 30);
        tomek.getAllInfo();

    }
}
