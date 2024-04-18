package Model;

import java.util.Objects;

public class User implements Comparable<User> {

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

    // TO CZĘSTO UŻYWANA METODA
    // W INTELLIJ MOŻNA JĄ WYGENEROWAĆ AUTOMATYCZNIE
    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", isAdult=" + isAdult +
                '}';
    }

    // W CODIUM TO MOŻNA WYGENEROWAĆ AUTOMATYCZNIE CTRL+.
    // TYLKO TROCHĘ GORZEJ TO DZIAŁA
    // A MOŻE TO TYLKO KWESTIA WERSJI JAVY
    // ZOSTAWIAM ORYGINALNY

    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj)
    //         return true;
    //     if (obj == null)
    //         return false;
    //     if (getClass() != obj.getClass())
    //         return false;
    //     User other = (User) obj;
    //     if (firstName == null) {
    //         if (other.firstName != null)
    //             return false;
    //     } else if (!firstName.equals(other.firstName))
    //         return false;
    //     if (lastName == null) {
    //         if (other.lastName != null)
    //             return false;
    //     } else if (!lastName.equals(other.lastName))
    //         return false;
    //     if (email == null) {
    //         if (other.email != null)
    //             return false;
    //     } else if (!email.equals(other.email))
    //         return false;
    //     if (age != other.age)
    //         return false;
    //     if (isAdult != other.isAdult)
    //         return false;
    //     return true;
    // }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
            isAdult == user.isAdult &&
            Objects.equals(firstName, user.firstName) &&
            Objects.equals(lastName, user.lastName) &&
            Objects.equals(email, user.email);
    }


    // @Override
    // public int hashCode() {
    //     final int prime = 31;
    //     int result = 1;
    //     result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
    //     result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
    //     result = prime * result + ((email == null) ? 0 : email.hashCode());
    //     result = prime * result + age;
    //     result = prime * result + (isAdult ? 1231 : 1237);
    //     return result;
    // }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, age, isAdult);
    }

    @Override
    public int compareTo(User user) {
        int compareResult = this.getFirstName().compareTo(user.getFirstName());
        if (compareResult == 0) {
            compareResult = this.getLastName().compareTo(user.getFirstName());
        }
        return compareResult;
    }

    // TWORZĄC KLASY ZAWSZE WARTO NADPISAĆ TOSTRING DO WYŚWIETLANIA, EQUALS DO PORÓWNYWANIA
    // A JAK EQUALS TO OD TEŻ HASHCODE - BEZ TEGO MOŻE NIEPRAWIDŁOWO WYŚWIETLAĆ ITD.

}