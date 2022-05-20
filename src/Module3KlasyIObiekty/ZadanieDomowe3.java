package Module3KlasyIObiekty;

public class ZadanieDomowe3 {

    public static void main(String[] args) {

        BugOld defect = new BugOld("Doesn't work", "joe.testowy@gmail.com", 2);
        defect.showBugDetails();
        defect.showReporter();
        defect.showBugStatus();
        System.out.println("Bug priority: " + defect.getBugPriority());
        defect.status = true;
        defect.showBugStatus();

        System.out.println();

        BugOld issue = new BugOld("It crashes", "joe.testowy@gmail.com", 5);
        issue.showBugDetails();
        issue.showReporter();
        System.out.println("Bug priority: " + issue.getBugPriority());
        issue.showBugStatus();

    }
}
