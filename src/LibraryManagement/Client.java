package LibraryManagement;

public class Client {
    public static void main(String[] args) {
        Member m1 = new Member("Nikhil", "nikhil@gmail.com");
        Member m2 = new Member("Rahul", "rahul@gmail.com");
        Librarian l1 = new Librarian("Suresh", "suresh@gmail.com", "emp1");
        Librarian l2 = new Librarian("Kartik", "kartikWgmail.com", "emp2");

        System.out.println(m1.getName());
        System.out.println(m1.getUserId());
        System.out.println(m2.getName());
        System.out.println(m2.getUserId());
        System.out.println(m2.getTotalUser());
        System.out.println(l1.getName());
        System.out.println(l1.getUserId());
        System.out.println(l2.getName());
        System.out.println(l2.getUserId());
        System.out.println(m2.getTotalUser());
        m1.displayDashboard();
        l1.displayDashboard();

    }
}
