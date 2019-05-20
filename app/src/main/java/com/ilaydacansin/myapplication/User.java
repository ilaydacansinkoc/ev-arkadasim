package com.ilaydacansin.myapplication;

/**
 * Created by Johnson on 1.05.2018.
 */


public class User {
    private String userName;
    private String password;
    private String name;
    private String department;
    private Degree degree;
    private int age;
    private String mailAddress;
    private String phoneNumber;

    public User(String userName,
                String password,
                String name,
                String department,
                Degree degree,
                int age,
                String mailAddress,
                String phoneNumber){

        this.userName=userName;
        this.password=password;
        this.name=name;
        this.department=department;
        this.degree=degree;
        this.age=age;
        this.mailAddress=mailAddress;
        this.phoneNumber=phoneNumber;

    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public Degree getDegree() {
        return degree;
    }
    public void setDegree(Degree degree) {
        this.degree = degree;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getMailAddress() {
        return mailAddress;
    }
    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

