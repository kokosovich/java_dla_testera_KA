public class Klasy {

    public static void main(String[] args) {
        // co to jest klasa i z czego się składa

        // typ nazwa = nowy obiekt
        User bartek = new User();
        bartek.firstName = "Bartek";
        bartek.lastName = "Testowy";
        bartek.email = "bartek@test.pl";
        bartek.age = 17;
        bartek.isAdult = false;
        System.out.println(bartek.firstName);

        System.out.println();

        User tomek = new User();
        tomek.firstName = "Tomek";
        tomek.lastName = "Smith";
        tomek.email = "tomek@test.pl";
        tomek.age = 30;
        tomek.isAdult = true;
        System.out.println(tomek.firstName);
        System.out.println(tomek.isAdult);

    }
}
