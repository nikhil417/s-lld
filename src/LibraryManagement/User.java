package LibraryManagement;

import java.util.UUID;

public abstract class User {
    private static int totalUser = 0;
    private final String userId;
    private String name;
    private String contactInfo;

    User() {
        this.userId = generateUniqueId();
        totalUser++;
    }

    User(String name, String contactInfo){
        this.userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
        totalUser++;
    }

    User(User u){
        this.userId = generateUniqueId();
        this.name = u.name;
        this.contactInfo = u.contactInfo;
        totalUser++;
    }

    private String generateUniqueId() {
        return UUID.randomUUID().toString();
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public int getTotalUser() {
        return totalUser;
    }

    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();


}
