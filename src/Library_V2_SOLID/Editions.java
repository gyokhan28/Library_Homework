package Library_V2_SOLID;

public abstract class Editions extends Library {

    protected boolean editionAvailable = true;

    public Editions(String name, String address, String workTime) {
        super(name, address, workTime);
    }

    public Editions() {
        super();
    }

    protected void book() {
        if (editionAvailable) {
            editionAvailable = false;
            System.out.println("The edition is now booked!");
        } else {
            System.out.println("This edition is unavailable!");
        }
    }

    protected void returnToLibrary() {
        if (editionAvailable) {
            System.out.println("The edition is already available (or returned) and can't be returned!");
        } else {
            editionAvailable = true;
            System.out.println("The edition is now available!");
        }
    }
}