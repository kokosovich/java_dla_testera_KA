package Module6PolaIMetodyStatyczne;

public class PetleWhile {
    public static void main(String[] args) {

        int i = 10;

        while (i > 20) {
            System.out.println(i);
            i++;
        }

        do {
            System.out.println("Jestem w do");
            System.out.println(i);
            i++;
        } while (i > 20);

    }
}
