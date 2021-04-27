package com.company;

public class Passenger {
    public int id;
    public Address address;
    public Contact contact;

     private final Object Address;
     private final Object Contact;

    public Passenger(int id,Address address,Contact contact){
        this.id=id;
        Address=address;
        Contact=contact;
    }
   /* public int getPassengerCount(){
        return id;
    }*/
    public Contact getContact(){
        return contact;
    }

    public Address getAddress(){
        return address;
    }
}