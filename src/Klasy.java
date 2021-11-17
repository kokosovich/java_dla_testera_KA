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
        bartek.getFullName();
        bartek.getAllInfo();
        System.out.println(bartek.getUserAge());
        int userAge = bartek.getUserAge();
        System.out.println(userAge);

        boolean userAdult = bartek.isUserAdult();
        System.out.println("Czy Bartek jest dorosły? " + userAdult);

        bartek.greetings("Marcin");
        bartek.greetings("Asia");

        bartek.howOldAreYou("Bartek", 17);

        int bartekAgePlus10 = bartek.yourAgePlus10(17);
        System.out.println(bartekAgePlus10);

        System.out.println();

        User tomek = new User();
        tomek.firstName = "Tomek";
        tomek.lastName = "Smith";
        tomek.email = "tomek@test.pl";
        tomek.age = 30;
        tomek.isAdult = true;
        tomek.getFullName();
        tomek.getAllInfo();

        boolean isTomekAdult = tomek.isUserAdult();
        System.out.println(isTomekAdult);

        System.out.println(tomek.yourAgePlus10(tomek.age));

    }
}
