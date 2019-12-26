package com.aanchal.esoftwarica;

public class Contacts {

    private String Name;
    private String Address;
    private String Gender;
    private int Age;
    private int imgProfileId;
    private  int imgRemoveId;


    public Contacts(String name, String address, String gender, int age) {
        Name = name;
        Address = address;
        Gender = gender;
        Age = age;
        this.imgProfileId = imgProfileId;
        this.imgRemoveId = imgRemoveId;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getImgProfileId() {
        return imgProfileId;
    }

    public void setImgProfileId(int imgProfileId) {
        this.imgProfileId = imgProfileId;
    }

    public int getImgRemoveId() {
        return imgRemoveId;
    }

    public void setImgRemoveId(int imgRemoveId) {
        this.imgRemoveId = imgRemoveId;
    }



}
