package Model;

public class NewBug {

    private String bugDescription;
    private String email;
    private int bugPriority;
    private boolean bugStatus;

    public NewBug(String bugDescription, String email, int bugPriority) {
        this.bugDescription = bugDescription;
        this.email = email;
        this.bugPriority = bugPriority;
        this.bugStatus = false;
    }

    public String getBugDescription() {
        return bugDescription;
    }

    public void setBugDescription(String description) {
        if (description.length() >= 10) {
            this.bugDescription = description;
        } else {
            System.out.println("Description too short (min. 10 chars)!");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String reportersEmail) {
        if (reportersEmail.contains("@")) {
            this.email = reportersEmail;
        } else {
            System.out.println("Incorrect email (must contain @)!");
        }
    }

    public int getBugPriority() {
        return bugPriority;
    }

    public void setBugPriority(int priority) {
        if ((priority >= 1) & (priority <= 5)) {
            this.bugPriority = priority;
        } else {
            System.out.println("Incorrect priority value (must be between 1 and 5)!");
        }
    }

    public boolean getBugStatus() {
        return bugStatus;
    }

    public void setBugStatus(boolean status) {
        this.bugStatus = status;
    }

    public void showBugDetails() {
        System.out.println("Bug: " + bugDescription + " - reported by: " + email + " - priority: " + bugPriority
                + " - open: " + bugStatus);
    }

    public void showReporter() {
        System.out.println(("Bug reported by: " + email));
    }

    public void showBugStatus() {
        System.out.println("Bug status: " + " " + bugStatus);
    }

}
