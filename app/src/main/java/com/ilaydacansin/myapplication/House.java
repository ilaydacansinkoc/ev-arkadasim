package com.ilaydacansin.myapplication;

/**
 * Created by Johnson on 1.05.2018.
 */

public class House {

    private Houseowner houseOwner;
    private int rentAmount;
    private int numberOfStudentsLivingAtHome;
    private int numberOfPeopleToStayAtHome;
    private float dues;
    private int numberOfRooms;
    private boolean isFurnished;
    private String heatingType;
    private String internetConnection;
    private String location;
    private String genderOfHouseholders;
    private String smokingStatus;
    private String hasPet;

    public House(Houseowner houseOwner, int rentAmount, int numberOfStudentsLivingAtHome,
                 int numberOfPeopleToStayAtHome, float dues, int numberOfRooms, boolean isFurnished, String heatingType,
                 String internetConnection, String location, String genderOfHouseholders, String smokingStatus,
                 String hasPet) {

        this.houseOwner = houseOwner;
        this.rentAmount = rentAmount;
        this.numberOfStudentsLivingAtHome = numberOfStudentsLivingAtHome;
        this.numberOfPeopleToStayAtHome = numberOfPeopleToStayAtHome;
        this.dues = dues;
        this.numberOfRooms = numberOfRooms;
        this.isFurnished = isFurnished;
        this.heatingType = heatingType;
        this.internetConnection = internetConnection;
        this.location = location;
        this.genderOfHouseholders = genderOfHouseholders;
        this.smokingStatus = smokingStatus;
        this.hasPet = hasPet;
    }

    public Houseowner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(Houseowner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public int getRentAmount() {
        return rentAmount;
    }

    public void setRentAmount(int rentAmount) {
        this.rentAmount = rentAmount;
    }

    public int getNumberOfStudentsLivingAtHome() {
        return numberOfStudentsLivingAtHome;
    }

    public void setNumberOfStudentsLivingAtHome(int numberOfStudentsLivingAtHome) {
        this.numberOfStudentsLivingAtHome = numberOfStudentsLivingAtHome;
    }

    public int getNumberOfPeopleToStayAtHome() {
        return numberOfPeopleToStayAtHome;
    }

    public void setNumberOfPeopleToStayAtHome(int numberOfPeopleToStayAtHome) {
        this.numberOfPeopleToStayAtHome = numberOfPeopleToStayAtHome;
    }

    public float getDues() {
        return dues;
    }

    public void setDues(float dues) {
        this.dues = dues;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public boolean isFurnished() {
        return isFurnished;
    }

    public void setFurnished(boolean isFurnished) {
        this.isFurnished = isFurnished;
    }

    public String getHeatingType() {
        return heatingType;
    }

    public void setHeatingType(String heatingType) {
        this.heatingType = heatingType;
    }

    public String isInternetConnection() {
        return internetConnection;
    }

    public void setInternetConnection(String internetConnection) {
        this.internetConnection = internetConnection;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGenderOfHouseholders() {
        return genderOfHouseholders;
    }

    public void setGenderOfHouseholders(String genderOfHouseholders) {
        this.genderOfHouseholders = genderOfHouseholders;
    }

    public String isSmokingStatus() {
        return smokingStatus;
    }

    public void setSmokingStatus(String smokingStatus) {
        this.smokingStatus = smokingStatus;
    }

    public String isHasPet() {
        return hasPet;
    }

    public void setHasPet(String hasPet) {
        this.hasPet = hasPet;
    }

    public float calculatePrice() {

        return (numberOfStudentsLivingAtHome + 1) / rentAmount;

    }


}
