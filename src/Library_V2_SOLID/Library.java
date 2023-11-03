package Library_V2_SOLID;

import java.util.ArrayList;
import java.util.List;

public class Library {
    protected String name;
    protected String address;
    protected String workTime;
    protected List<Editions> editionsList;
    protected EditionModifier editionModifier;

    public Library(String name, String address, String workTime) {
        this.name = name;
        this.address = address;
        this.workTime = workTime;
        this.editionsList = new ArrayList<>();
        this.editionModifier = new EditionModifier(editionsList);
    }

    public Library() {
        this.name = "Unnamed";
        this.address = "Unknown";
        this.workTime = "9:00 - 17:00";
        this.editionsList = new ArrayList<>();
        this.editionModifier = new EditionModifier(editionsList);
    }

    public void addToEditionsList(Editions edition){
        editionModifier.add(edition);
    }
    public void printEditionsList(){
        editionModifier.print();
    }
    public void search(Editions editionPassedByUser){
        editionModifier.search(editionPassedByUser);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }
}