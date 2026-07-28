package LLDLibrary.models;

import java.util.Objects;

public class Member {
    private final String memberId;
    private String name;
    private Address address;

    public Member(String memberId, String name, Address address) {
        if (memberId == null || memberId.isBlank()) {
            throw new IllegalArgumentException("Member ID is required");
        }

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name is required");
        }

        if (address == null) {
            throw new IllegalArgumentException("Address is required");
        }

        this.memberId = memberId;
        this.name = name;
        this.address = address;
    }

    public void changeName(String name){
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Invalid name");
        };
        this.name = name;
    }

    public void changeAddress(Address newAddress) {
        if (newAddress == null) {
           throw new IllegalArgumentException(("Invalid address"));
        };
        this.address = newAddress;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId='" + memberId + '\'' +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Member member)) return false;
        return memberId.equals(member.memberId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(memberId);
    }
}
