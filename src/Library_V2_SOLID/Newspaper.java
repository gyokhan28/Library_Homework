package Library_V2_SOLID;

public class Newspaper extends Editions implements Detailable {
    private String newspaperName;
    private String dateOfEdition;

    public Newspaper(String newspaperName, String dateOfEdition) {
        this.newspaperName = newspaperName;
        this.dateOfEdition = dateOfEdition;
    }

    public Newspaper() {
        this.newspaperName = "Unknown";
        this.dateOfEdition = "01.01.2000";
    }



    public String getNewspaperName() {
        return newspaperName;
    }

    public void setNewspaperName(String newspaperName) {
        this.newspaperName = newspaperName;
    }

    public String getDateOfEdition() {
        return dateOfEdition;
    }

    public void setDateOfEdition(String dateOfEdition) {
        this.dateOfEdition = dateOfEdition;
    }

    @Override
    public void getDetails() {
        System.out.println("Newspaper name: " + this.getNewspaperName() + ", Date: " + this.getDateOfEdition());
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "newspaperName='" + newspaperName + '\'' +
                ", dateOfEdition='" + dateOfEdition + '\'' +
                '}';
    }

}
