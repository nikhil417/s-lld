package LibraryManagement;

public class TextBook extends Book{

    String subject;
    int edition;

    TextBook(String isbn, String title, String author, String subject, int edition) {
        super(isbn, title, author);
        this.subject = subject;
        this.edition = edition;
    }


    @Override
    public void displayBookDetails() {
        System.out.println("---Text book Details---");
    }

    @Override
    public boolean lend(User user) {
        return false;
    }
}
