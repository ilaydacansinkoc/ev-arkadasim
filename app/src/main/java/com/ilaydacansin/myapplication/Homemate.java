package com.ilaydacansin.myapplication;

/**
 * Created by Johnson on 1.05.2018.
 */

public class Homemate extends User {

    private int budget;
    private String smokingStatus;


    public Homemate(String userName,
            String password,
            String name,
            String department,
            Degree degree,
            int age,
            String mailAddress,
            String phoneNumber,
            int budget, String smokingStatus) {

        super(userName,password,name,department,null,age,mailAddress,phoneNumber);
        this.budget = budget;
        this.smokingStatus = smokingStatus;


    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String isSmokingStatus() {
        return smokingStatus;
    }

    public void setSmokingStatus(String smokingStatus) {
        this.smokingStatus = smokingStatus;
    }

  /*public boolean editProfile() {
        return true;
    }

    public House searchHouseByBudget() {
    }

    public House searchHouseByLocation() {
    }*/
}

