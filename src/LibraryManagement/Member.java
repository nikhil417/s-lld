package LibraryManagement;

public class Member extends User{
    String name;
    String contactInfo;
    String userId;
    final int MAX_BORROW_LIMIT = 5;
    int borrowedCount;

    public Member(String name, String contactInfo){
        super(name, contactInfo);
        this.borrowedCount = 0;

    }


    @Override
    public void displayDashboard() {
        System.out.println("Member Dashboard" + this.name);
        System.out.println("Borrowed Book Count: " + borrowedCount );

    }

    @Override
    public boolean canBorrowBooks() {
        return borrowedCount < MAX_BORROW_LIMIT;
    }
}
