package Module2TypyDanych;

public class ModuloOrazNazewnictwoIFormatowanie {

    public static void main(String[] args) {

        // Nazwy klas
        // User, SuperUser, AdminUser

        // Zmienne
        String superUser = "Jestem super user";
        int numberTen = 10;
        int numberNine = 9;
        boolean isTrue = true;

        if (isTrue)
            System.out.println(superUser);

        // formatowanie kodu - Ctrl+Alt+L
        if (numberTen > 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println(10 % 5);
        System.out.println(10 % 3);
        System.out.println(10 % 4);

        if (numberNine % 2 == 0) {
            System.out.println("liczba parzysta");
        } else {
            System.out.println("liczba nieparzysta");
        }

    }
}
