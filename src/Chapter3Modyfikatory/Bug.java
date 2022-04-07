package Chapter3Modyfikatory;

public class Bug {

    private String description;
    private String reportersEmail;
    private int priority;
    private boolean status;

    public Bug (String description, String reportersEmail, int priority) {
        this.description = description;
        this.reportersEmail = reportersEmail;
        this.priority = priority;
        this.status = false;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description.length() >= 10) {
            this.description = description;
        } else {
            System.out.println("Description too short (min. 10 chars)!");
        } 
    }

/*  PROPOZYCJA PROWADZĄCEGO   
    public void setDescription(String description) {
        if (description.length() < 10) {
            System.out.println("Description too short (min. 10 chars)!");
        } else {
            this.description = description;
        } 
    } */

    public String getReportersEmail() {
        return reportersEmail;
    }

    public void setReportersEmail(String reportersEmail) {
        if (reportersEmail.contains("@")) {
            this.reportersEmail = reportersEmail;
        } else {
            System.out.println("Incorrect email (must contain @)!");
        }
    }

/*  PROPOZYCJA PROWADZĄCEGO
    public void setReportersEmail(String reportersEmail) {
        if (!reportersEmail.contains("@")) {
            System.out.println("Incorrect email (must contain @)!");
        } else {
            this.reportersEmail = reportersEmail;
        }
    } */

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        if ((priority >= 1) & (priority <= 5)) {
            this.priority = priority;
        } else {
            System.out.println("Incorrect priority value (must be between 1 and 5)!");
        }
    }

/*     
    public void setPriority(int priority) {
        switch (priority) {
            case 1: // taki trick w switch jeżeli dla każdego case'a robimy to samo
            case 2: 
            case 3:
            case 4:
            case 5:
                this.priority = priority;
                break;
            default:{
                System.out.println("Priority out of scale (must be between 1 and 5)!");
            }
        }
    } */

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void showBugDetails() {
        System.out.println("Bug: " + description + " - reported by: " + reportersEmail + " - priority: " + priority + " - open: " + status);
    }

    public void showReporter() {
        System.out.println(("Bug reported by: " + reportersEmail));
    }

    public void showBugStatus() {
        System.out.println("Bug status: " + " " + status);       
    }

}