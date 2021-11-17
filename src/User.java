import java.sql.SQLOutput;

public class User {

    // 1. pola obiektu - opisują z czego będzie się składał dany obiekt

    String firstName; // String domyślnie null
    String lastName; // null
    String email; // null
    int age; // int domyślnie 0
    boolean isAdult; // boolean domyślnie false

    // 2. metody - opisują co dany obiekt będzie mógł zrobić

    // zwracany typ + nazwa metody
    void getFullName() {
        // ciało metody
        System.out.println(firstName + " " + lastName);
    }

    void getAllInfo() {
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }

    int getUserAge() {
        return age;
    }

    boolean isUserAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    void greetings(String name) {
        System.out.println("Hi " + name + ". Nice to see you!");
    }

    void howOldAreYou(String name, int userAge) {
        System.out.println("Hi " + name + ". You are " + userAge + " years old.");
    }

    int yourAgePlus10(int userAge) {
        return userAge + 10;
    }
}
