package Module2TypyDanych;
public class Operatory {

    public static void main(String[] args) {

        // operatory matematyczne
        double a = 10;
        double b = 4;
        System.out.println(10 + 10);
        System.out.println(10 - 10);
        System.out.println(10 * 10);
        System.out.println(10 / 10);
        System.out.println(a / b);
        System.out.println();

        //operatory porównania
        int numOne = 1;
        int numTwo = 2;
        System.out.println(numOne > numTwo);
        System.out.println(numOne < numTwo);
        System.out.println(numOne == numTwo);
        System.out.println(numOne != numTwo);
        System.out.println();

        // operatory logiczne
        // || - lub
        System.out.println(numOne > numTwo || numOne == 1); // fałsz || prawda -> prawda
        System.out.println(numOne > numTwo || numOne != 1); // fałsz || fałsz -> fałsz
        System.out.println(numOne < numTwo || numOne != 1); //prawda || nie jest sprawdzana -> prawda
        System.out.println();

        // && - i
        System.out.println(numOne < numTwo && numOne == 1); // prawda i prawda -> prawda
        System.out.println(numOne > numTwo && numOne == 1); // fałsz i prawda -> fałsz
        System.out.println(numOne < numTwo && numOne != 1); // fałsz i fałsz -> fałsz
        System.out.println();
    }
}
