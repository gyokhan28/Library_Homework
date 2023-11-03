package Library_V1;

import java.util.ArrayList;

public class Library {
    protected String name;
    protected String address;
    protected String workTime;
    protected ArrayList<Editions> editionsList;

    protected void addToEditionsList(Editions... edition) {
        for (Editions e : edition) {
            editionsList.add(e);
        }
    }

    public void printEditionsList() {
        for (Editions e : editionsList) {
            System.out.println(e.toString());
        }
    }


    public Library(String name, String address, String workTime) {
        this.name = name;
        this.address = address;
        this.workTime = workTime;
        this.editionsList = new ArrayList<>();
    }

    public Library() {
        this.name = "Unnamed";
        this.address = "Unknown";
        this.workTime = "9:00 - 17:00";
        this.editionsList = new ArrayList<>();
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

    protected void search(Editions editionPassedByUser) {
        boolean flag = false;
        for (Editions editions : editionsList) {
            if (editions.equals(editionPassedByUser) && editions.editionAvailable) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Edition found. It is now set to unavailable!");
            editionPassedByUser.editionAvailable = false;
        } else {
            System.out.println("Edition not found!");
        }
    }
}