package LLDLibrary;

import LLDLibrary.models.Address;
import LLDLibrary.models.Member;

public class Main {
    public static void main(String[] args) {
        Address address1 =
                new Address("MG Road", "Bangalore", "560001");

        Address address2 =
                new Address("MG Road", "Bangalore", "560001");

        Member member1 =
                new Member("M101", "Nikhil", address1);

        Member member2 =
                new Member("M101", "Nikhil Kumar", address2);

        Member member3 =
                new Member(
                        new String("M101"),
                        "Different name",
                        address1
                );

        System.out.println(member1.equals(member3));


        System.out.println(address1 == address2);
        System.out.println(address1.equals(address2));

        System.out.println(member1 == member2);
        System.out.println(member1.equals(member2));
    }
}
