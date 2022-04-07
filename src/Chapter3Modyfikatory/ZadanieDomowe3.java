package Chapter3Modyfikatory;

public class ZadanieDomowe3 {
    
    public static void main(String[] args) {

        // Rozwiązanie zadania domowego znajduje się w Bug.java - tutaj tylko sprawdzam
        
        Bug bug = new Bug("Don't work", "joe.testowy@gmail.com", 2);
        bug.setDescription("Don't");
        bug.setReportersEmail("joe.testowy.gmail.com");
        bug.setPriority(0);
        bug.setPriority(6);

        System.out.println();
        bug.showBugDetails();

        bug.setDescription("Bug description");
        bug.setReportersEmail("jt@gmail.com");
        bug.setPriority(5);

        System.out.println();
        bug.showBugDetails();
        bug.showReporter();
        bug.showBugStatus();
        System.out.println("Bug priority: " + bug.getPriority());
        bug.setStatus(true);
        bug.showBugStatus();

    }
}
