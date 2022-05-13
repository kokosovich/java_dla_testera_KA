package Module5Tablice;

public class ZadanieRekrutacyjne1 {

    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 3, 4, 5};

        // 1 rozwiązanie - najprościej
        // int first = numbers[0];
        // int last = numbers[numbers.length -1];
        // numbers[0] = last;
        // numbers[numbers.length -1] = first;

        // 2 rozwiązanie - użyto tylko 1 zmiennej
        // int first = numbers[0];
        // numbers[0] = numbers[numbers.length - 1];
        // numbers[numbers.length - 1] = first;

        // 3 rozwiązanie - bez dodatkowej zmiennej
        // dodając i usuwając wartości
        numbers[numbers.length - 1] = numbers[numbers.length -1] + numbers[0];
        numbers[0] = numbers[numbers.length - 1] - numbers[0];        
        numbers[numbers.length - 1] = numbers[numbers.length -1] - numbers[0];
        
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println();

    }
    
}
