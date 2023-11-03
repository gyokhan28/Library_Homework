package Library_V2_SOLID;

import java.util.List;

public class EditionModifier {
    private final List<Editions> editionsList;

    public EditionModifier(List<Editions> editionsList) {
        this.editionsList = editionsList;
    }

    protected void add(Editions edition) {
        editionsList.add(edition);
    }

    public void print() {
        for (Editions e : editionsList) {
            System.out.println(e.toString());
        }
    }

    public void search(Editions editionPassedByUser) {
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
