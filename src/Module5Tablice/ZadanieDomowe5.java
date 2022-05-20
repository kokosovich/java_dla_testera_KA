package Module5Tablice;

public class ZadanieDomowe5 {

    public static void main(String[] args) {

        // czesc 1 - zamien miejscami pierwszy z ostatnim elementem tabeli
        int[] numbers = { 1, 2, 3, 4, 5 };

        numbers[0] = numbers[0] + numbers[numbers.length - 1];
        numbers[numbers.length - 1] = numbers[0] - numbers[numbers.length - 1];
        numbers[0] = numbers[0] - numbers[numbers.length - 1];

        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println();

        // czesc 2 - policzyc liczby parzyste i nieparzyste
        int[] numbs = { 2, 2, 3, 4, 5, 7, 7, 7, 8, 8, 2 };

        int odd = 0;
        int even = 0;

        for (int num : numbs) {
            if (num % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }

        System.out.println("Parzystych: " + even);
        System.out.println("Nieparzystych: " + odd);
        System.out.println();

        // czesc 3 - posortowac od najmniejszej do najwiekszej
        // 0 1 2 2 4 4 5 5 8 9
        int[] nums = { 2, 4, 1, 9, 5, 2, 4, 0, 5, 8 };

        for (int x = 0; x < nums.length; x++) {
            for (int y = x + 1; y < nums.length; y++) {
                if (nums[y] < nums[x]) {
                    nums[x] = nums[x] + nums[y];
                    nums[y] = nums[x] - nums[y];
                    nums[x] = nums[x] - nums[y];
                }
            }
        }

        for (int n : nums) {
            System.out.println(n);
        }
        System.out.println();

        // czesc 4 - posortowac od najwiekszej do najmniejszej
        // 9 8 5 5 4 4 2 2 1 0
        int[] ns = { 2, 4, 1, 9, 5, 2, 4, 0, 5, 8 };

        for (int x = 0; x < ns.length; x++) {
            for (int y = x + 1; y < ns.length; y++) {
                if (ns[x] < ns[y]) {
                    ns[x] = ns[x] + ns[y];
                    ns[y] = ns[x] - ns[y];
                    ns[x] = ns[x] - ns[y];
                }
            }
        }

        for (int n : ns) {
            System.out.println(n);
        }

    }

}
