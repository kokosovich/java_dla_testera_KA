package Module6PolaIMetodyStatyczne;

import Model.User;

public class MainApp {

    public static void main(String[] args) {

        User u1 = new User("Bartek", "Test", "bt@test.pl", 17);
        User u2 = new User("Bartek", "Test", "bt@test.pl", 17);
        User u3 = new User("Bartek", "Test", "bt@test.pl", 17);
        User u4 = new User("Bartek", "Test", "bt@test.pl", 17);

        System.out.println(User.getUserCounter());

    }

}
