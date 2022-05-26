package Module2TypyDanych;

public class InstrukcjeSterujace {

    public static void main(String[] args) {

        int numOne = 10;
        int numTwo = 2;

        if (numOne < numTwo) {
            System.out.println("number one is less than number two");
        } else {
            System.out.println("number one is greater than number two");
        }

        String homePage = "Home";
        String loginPage = "Login";
        String contactPage = "Contact";

        String page = "strona";

        switch (page) {
            case "Home":
                System.out.println("Przełączam się do strony " + homePage);
                break;
            case "Login":
                System.out.println("Przełączam się do strony " + loginPage);
                break;
            case "Contact":
                System.out.println("Przełączam się do strony " + contactPage);
                break;
            default:
                System.out.println("Nie znam takiej strony");
        }
    }
}
