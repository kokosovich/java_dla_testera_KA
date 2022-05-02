package Module3KlasyIObiekty;
public class BugOld {
    // POLA OBIEKTU
    // - opis błędu
    // - adres email osoby zgłaszającej błąd
    // - priorytet błedu (1-5)
    // - status błędu (otwarty/zamknięty) - domyślnie, podczas tworzenia zawsze otwarty

    String description;
    String reportersEmail;
    int priority;
    boolean status;

    // KONSTRUKTOR

    BugOld(String description, String reportersEmail, int priority) {
        this.description = description;
        this.reportersEmail = reportersEmail;
        this.priority = priority;
        this.status = false;
    }

    //METODY
    // - pokaż wszystkie informacje na temat błędu
    void showBugDetails() {
        System.out.println("Bug: " + description + " - reported by: " + reportersEmail + " - priority: " + priority + " - open: " + status);
    }

    // - pokaż osobę zgłaszającą błąd
    void showReporter() {
        System.out.println(("Bug reported by: " + reportersEmail));
    }

    // - pokaż status błędu
    void showBugStatus() {
        System.out.println("Bug status: " + " " + status);       
    }

    // - zwróć priorytet błędu
    int getBugPriority() {
        return priority;
    }

}