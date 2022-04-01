public class MainApp {

    public static void main(String[] args) {
        // co to jest klasa i z czego się składa

        // typ nazwa = nowy obiekt
        User bartek = new User("Bartek", "Testowy", "bartek@test.pl", 17); // wywołanie konstruktora
        bartek.getAllInfo();

        User tomek = new User("Tomek", "Smith", "tomek@test.pl", 30);
        tomek.getAllInfo();

        System.out.println();

        Bug defect = new Bug("Doesn't work", "joe.testowy@gmail.com", 2);
        defect.showBugDetails();
        defect.showReporter();
        System.out.println("Bug priority: " + defect.getBugPriority());
        defect.status = true;
        defect.showBugStatus();

        Bug issue = new Bug("It crashes", "joe.testowy@gmail.com", 5);
        issue.showBugDetails();
        issue.showReporter();
        System.out.println("Bug priority: " + issue.getBugPriority());
        issue.showBugStatus();

    }
}
