package Module10Kolekcje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Model.User;

public class MainApp2Obiekty {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        users.add(new User("Bartek", "Testowy", "bk@test.com", 17));
        users.add(new User("Tomek", "Testowy", "bk@test.com", 27));
        users.add(new User("Marcin", "Testowy", "bk@test.com", 37));
        users.add(new User("Asia", "Testowy", "bk@test.com", 10));

        for (User user : users) {
            System.out.println(user.getFirstName());
        }

        Collections.sort(users, Comparator.comparing(User::getFirstName));
        System.out.println(users);

        Collections.sort(users, Comparator.comparingInt(User::getAge));
        for (User user : users) {
            System.out.println(user.getFirstName() + " " + user.getAge());
        }

        Collections.sort(users, Comparator.comparingInt(User::getAge).reversed());
        for (User user : users) {
            System.out.println(user.getFirstName() + " " + user.getAge());
        }
        
    }

}