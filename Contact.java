package com.company;

public class Contact {
    public String name;
    public String phone;
    public String email;

    public Contact(String name,String phone,String email){
        this.name=name;
        this.phone=phone;
        this.email=email;
    }
    public Contact(){

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getContactDetails(){
            return ("Name:"+name+" Phone:"+phone+" Email:"+email);
    }
    //public void updateContactDetails(String contactDetail){
           //this.contactDetail=contactDetail;
    //}
}
