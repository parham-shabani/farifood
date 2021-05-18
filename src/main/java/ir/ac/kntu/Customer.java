package ir.ac.kntu;

import java.math.BigInteger;

public class Customer {
    private String address;

    private BigInteger phoneNumber;

    public Customer(String address, BigInteger phoneNumber) {
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Customer() {
    }

    /*public String getAddress() {
        return address;
    }*/

    public void setAddress(String address) {
        this.address = address;
    }

    /*public BigInteger getPhoneNumber() {
        return phoneNumber;
    }*/

    public void setPhoneNumber(BigInteger phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

