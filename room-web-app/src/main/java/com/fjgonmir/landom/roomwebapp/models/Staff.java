package com.fjgonmir.landom.roomwebapp.models;

public class Staff {

    private long idStaff;
    private String firstName;
    private String lastName;
    private String position;

    public Staff(long idStaff, String firstName, String lastName, String position) {
        this.idStaff = idStaff;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public Staff() {
    }

    public long getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(long idStaff) {
        this.idStaff = idStaff;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
