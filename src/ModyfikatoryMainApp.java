public class ModyfikatoryMainApp {
    public static void main(String[] args) {
        
        int i = 10;
        String strA = "Jakis text";

        // String tak naprawdę jest obiektem
        String strB = new String("Hello from Java");

        System.out.println(i + "\n" + strA + "\n" + strB);

        System.out.println();

        // częste metody na stringach

        String str1 = "Hello";
        String str2 = "hello";

        System.out.println(str1.equals(str2));

        System.out.println(str1.equalsIgnoreCase(str2));

        String s = str1.toUpperCase();
        System.out.println(s);
        String s1 = str1.toLowerCase();
        System.out.println(s1);

        boolean startsWith = str1.startsWith("He");
        System.out.println(startsWith);
        System.out.println(str1.endsWith("lo"));
        System.out.println(str1.contains("ll"));

        System.out.println("         ".isBlank()); // sprawdza czy są znaki ignorując spacje
        System.out.println(" ".isEmpty()); // sprawdza czy pusty wliczając spacje

        String replace = str1.replace("llo", "QWE");
        System.out.println(replace);
        String replaceAll = str1.replaceAll("l", "x");
        System.out.println(replaceAll);

        String subString = str1.substring(1, 4); // numerowanie od 0 a ostatni index nie jest brany pod uwagę
        System.out.println(subString);

        String textWithWhiteSpaces = "    to jest jakiś text    ";
        System.out.println(textWithWhiteSpaces.length());

        String strip = textWithWhiteSpaces.strip(); // obcina spacje na początku i na końcu stringa
        System.out.println(strip);
        System.out.println(strip.length());

    }
}
