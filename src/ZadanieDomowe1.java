public class ZadanieDomowe1 {

    public static void main(String[] args) {

        // 1. 4 zmienne typu int
        // 2. Sprawdzić czy suma dwóch pierwszych jest parzysta
        // 3. Sprawdzić czy suma dwóch pozostałych jest parzysta
        // 4. Jeżeli dwie sumy są parzyste to wyświetl informacje, że wszystkie liczby są parzyste

        int numOne = 7835;
        int numTwo = 9323;
        int numThree = 4291;
        int numFour = 8573;

        int sumOneTwo = numOne + numTwo;
        int sumThreeFour = numThree + numFour;

        System.out.println(sumOneTwo);
        System.out.println(sumThreeFour);

        boolean isSumOneTwoEven = (sumOneTwo % 2 == 0);
        boolean isSumThreeFourEven = (sumThreeFour % 2 == 0);

        if ((isSumOneTwoEven == true) && (isSumThreeFourEven == true)) {
            System.out.println("sumy są parzyste");
        } else {
            System.out.println("sumy są nieparzyste");
        }

    }
}
