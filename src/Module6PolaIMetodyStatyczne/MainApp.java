package Module6PolaIMetodyStatyczne;

import Model.User;

public class MainApp {

    public static void main(String[] args) {

        User u1 = new User("Bartek", "Test", "bt@test.pl", 17);
        User u2 = new User("Bartek", "Test", "bt@test.pl", 17);
        User u3 = new User("Bartek", "Test", "bt@test.pl", 17);
        User u4 = new User("Bartek", "Test", "bt@test.pl", 17);

        System.out.println(u1.getFirstName() + " " + u1.getLastName());
        System.out.println(u2.getFirstName() + " " + u2.getLastName());
        System.out.println(u3.getFirstName() + " " + u3.getLastName());
        System.out.println(u4.getFirstName() + " " + u4.getLastName());

        System.out.println(User.getUserCounter());

    }

}
