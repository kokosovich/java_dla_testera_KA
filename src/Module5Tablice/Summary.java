package Module5Tablice;

public class Summary {

    public static void main(String[] args) {

        int[] numbers = new int[10];
        System.out.println("długość tablicy: " + numbers.length);

        int[] newNumbers = { 1, 2, 3, 4, 5 };
        int x = 0;
        System.out.println(newNumbers[x++] + ", " + newNumbers[x++] + ", " + newNumbers[x++]);

        String[] names = { "Bartek", "Marcin", "Michał", "Tomek" };
        System.out.println("długość tablicy imion: " + names.length);

        for (String name : names) {
            System.out.println(name.toUpperCase());
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i].toLowerCase());
        }

        int number = 10;

        // number = number + 1; // zwiększenie wartości o 1
        // number += 1; // tak też można zwiększyć wartość

        System.out.println(number++); // post increment - najpierw wyświetla potem zwiększa

        System.out.println(number);

        System.out.println(++number); // pre increment - najpierw zwiększa potem wyświetla

    }
}
