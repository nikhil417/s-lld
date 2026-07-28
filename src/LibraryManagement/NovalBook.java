package LibraryManagement;

public class NovalBook extends Book {
    String genre;

    NovalBook(String isbn, String title, String author) {
        super(isbn, title, author);
    }


    @Override
    public void displayBookDetails() {
        System.out.println("--- Noval Book --- " + this.getTitle());
    }

    @Override
    public boolean lend(User user) {
        return false;
    }
}
