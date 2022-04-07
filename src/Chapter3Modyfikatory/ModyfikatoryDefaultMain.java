package Chapter3Modyfikatory;
import Model.User;

public class ModyfikatoryDefaultMain {
    
    public static void main(String[] args) {

        // MODYFIKATORY DOSTĘPU - access modifiers

        // DOMYŚLNY - działa w obrębie jednego pakietu
        // PUBLICZNY - dostęp w całym projekcie
        // PROTECTED - 
        // PRIVATE - dostęp do lub metody tylko w obrębie danej klasy
        
        User user = new User("Bartek", "Testowy", "bk@test.com", 17);
        System.out.println(user.isUserAdult());

        System.out.println(user.getEmail());

        user.setEmail("bartek@javadlatestera.ru");

        System.out.println(user.getEmail());

    }

}
