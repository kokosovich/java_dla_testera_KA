package Model;

public class User {

    // pole statyczne - należy do klasy i przez klasę należy się do tego pola
    // odwoływać
    private static int userCounter = 0;

    // 1. pola obiektu - opisują z czego będzie się składał dany obiekt

    private String firstName; // String domyślnie null
    private String lastName; // null
    private String email; // null
    private int age; // int domyślnie 0
    private boolean isAdult; // boolean domyślnie false

    // 3. konstruktor
    // domyślny konstruktor - tworzy pusty obiekt
    // konstruktor piszemy wielką literą
    // konstruktor nie ma zwracanego typu

    public User(String firstName, String lastName, String email, int age) {
        this.firstName = firstName; // this - wskaźnik na dany obiekt
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isUserAdult();
        userCounter++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.endsWith(".ru")) {
            System.out.println("RU email are not allowed!");
        } else {
            this.email = email;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    // 2. metody - opisują co dany obiekt będzie mógł zrobić

    // zwracany typ + nazwa metody
    public void getFullName() {
        // ciało metody
        System.out.println(firstName + " " + lastName);
    }

    public void getAllInfo() {
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }

    public int getUserAge() {
        return age;
    }

    public boolean isUserAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public void greetings(String name) {
        System.out.println("Hi " + name + ". Nice to see you!");
    }

    public void greetings(String firstName, String lastName) {
        System.out.println("Hi " + firstName + " " + lastName + ". Nice to see you!");
    }

    public void howOldAreYou(String name, int userAge) {
        System.out.println("Hi " + name + ". You are " + userAge + " years old.");
    }

    public int yourAgePlus10(int userAge) {
        return userAge + 10;
    }

    public static int getUserCounter() {
        return userCounter;
    }
}