package LLDLibrary.models;

import java.util.Objects;

public final class Address {
    private final String street;
    private final String city;
    private final String pincode;

    public Address(String street, String city, String pincode) {
        if (street == null || street.isBlank()) {
            throw new IllegalArgumentException("Street is required");
        }

        if (city == null || city.isBlank()) {
            throw new IllegalArgumentException("City is required");
        }

        if (pincode == null || pincode.isBlank()) {
            throw new IllegalArgumentException("Pincode is required");
        }


        this.street = street;
        this.city = city;
        this.pincode = pincode;

    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Address address)) {
            return false;
        }
        return Objects.equals(street, address.street) && Objects.equals(city, address.city) && Objects.equals(pincode, address.pincode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, city, pincode);
    }
}
