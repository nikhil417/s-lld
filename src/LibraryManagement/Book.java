package LibraryManagement;

public abstract class Book implements Lendable {
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    Book(){
        isAvailable = true;
    }

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    Book(Book b) {
        this.isbn = b.isbn;
        this.title = b.title;
        this.author = b.author;
        this.isAvailable = b.isAvailable;
    }

    public boolean lendable(User u) {
        return isAvailable && u.canBorrowBooks();
    }

    public void returnItem(User u) {
        isAvailable = true;

    }

    public boolean isAvailable(){
        return isAvailable;
    }

    public abstract void displayBookDetails();
}
