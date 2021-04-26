package com.company;

public class Passenger {
    public int id;
    public com.company.Address address;
    public com.company.Contact contact;

    public com.company.Contact getContact()
    {
        return contact;
    }

    public com.company.Address getAddress(){
        return address;
    }
}