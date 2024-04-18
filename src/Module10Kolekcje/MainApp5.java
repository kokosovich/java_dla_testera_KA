package Module10Kolekcje;

import Model.User;

import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class MainApp5 {

    public static void main(String[] args) {
        
        // SET - ZBIÓR UNIKALNYCH ELEMENTÓW

        Set<User> users = new HashSet<>();
        users.add(new User("Bartek", "Testowy", "b@t.pl", 11));
        users.add(new User("Bartek", "Testowy", "b@t.pl", 11));
        users.add(new User("Tomek", "Testowy", "b@t.pl", 11));
        users.add(new User("Asia", "Testowa", "b@t.pl", 11));
        users.add(new User("Asia", "Jakas", "b@t.pl", 11));
        users.add(new User("Asia", "Anonimowa", "b@t.pl", 11));

        System.out.println(users.size());

        Set<User> sortedUser = new TreeSet<>(users);
        
        for (User user : sortedUser) {
            System.out.println(user.getFirstName() + " " + user.getLastName());
        }

        // List<User> userList = new ArrayList<>();
        // userList.add(new User("Bartek", "Testowy", "b@t.pl", 11));
        // userList.add(new User("Bartek", "Testowy", "b@t.pl", 11));
        // userList.add(new User("Tomek", "Testowy", "b@t.pl", 11));
        // userList.add(new User("Asia", "Testowa", "b@t.pl", 11));
        // userList.add(new User("Asia", "Jakaś", "b@t.pl", 11));
        // userList.add(new User("Asia", "Anonimowa", "b@t.pl", 11));

        // Collections.sort(userList, Comparator.comparing(User::getFirstName));

        // for (User user : userList) {
        //     System.out.println(user.getFirstName() + " " + user.getLastName());
        // }

    }
    
}
