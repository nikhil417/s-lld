package LibraryManagement;

public class Librarian extends User{
    private final String employeeNumber;
    String name;
    String contactInfo;
    String userId;

    Librarian(String name, String contactInfo, String employeeNumber) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;

    }

    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard " + getName());
        System.out.println("Emp Id: " + employeeNumber);

    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    public void addNewBook(Book book) {

    }

    public void removeBook(Book book){

    }
}
