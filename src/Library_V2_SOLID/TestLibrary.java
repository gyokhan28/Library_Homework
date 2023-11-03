package Library_V2_SOLID;

public class TestLibrary {
    public static void main(String[] args) {
        Editions[] editions = new Editions[4];
        editions[0] = new Book("First Book", "First Author", 1995);
        editions[1] = new Newspaper("First Magazine", "9.05.2023");
        editions[2] = new Book("First Book 2", "First Author 2", 1993);
        editions[3] = new Newspaper("First Magazine 2", "19.05.2023");

        Library l1 = new Library("Library1", "Library Address", "8-17");

        for(int i=0;i<4;i++) {
            l1.addToEditionsList(editions[i]);
        }
        System.out.println();
        l1.printEditionsList();

        System.out.println("*".repeat(30));

        //getDetails от интерфейса
        Book b1 = new Book("Second Book", "Second Author", 2003);
        Newspaper np1 = new Newspaper("Second Magazine", "15.10.2022");
        b1.getDetails();
        np1.getDetails();

        System.out.println("*".repeat(30));

        l1.search(editions[0]);
        editions[0].book();
        editions[0].returnToLibrary();
        editions[0].returnToLibrary();
        editions[0].book();
        editions[0].book();

        System.out.println("*".repeat(30));

        l1.search(b1);
        l1.search(np1);
        l1.addToEditionsList(b1);
        l1.addToEditionsList(np1);
        l1.search(b1);
        l1.search(np1);

        System.out.println("*".repeat(30));

        Editions e5 = new Book("Some Book", "Some Author", 1995);
        l1.addToEditionsList(e5);
        e5.book();
        l1.search(e5);

    }
}