package com.ilaydacansin.myapplication;

/**
 * Created by Johnson on 1.05.2018.
 */


public class Houseowner extends User {
    private House house;

    public Houseowner(String userName,
                      String password,
                      String name,
                      String department,
                      Degree degree,
                      int age,
                      String mailAddress,
                      String phoneNumber
                      ) {
        super(userName,password,name,department,degree,age,mailAddress,phoneNumber);
    }

    public Houseowner(String userName,
                      String password,
                      String name,
                      String department,
                      Degree degree,
                      int age,
                      String mailAddress,
                      String phoneNumber,
                      House house) {
        super(userName,password,name,department,degree,age,mailAddress,phoneNumber);
        this.setHouse(house);
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }



}
