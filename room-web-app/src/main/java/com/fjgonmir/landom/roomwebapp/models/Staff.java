package com.fjgonmir.landom.roomwebapp.models;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "EMPLOYEE")
public class Staff {

    @Id
    @Column(name = "EMPLOYEE_ID")
    private String idStaff;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name="POSITION")
    @Enumerated(EnumType.STRING)
    private Position position;

    public Staff(String idStaff, String firstName, String lastName, Position position) {
        this.idStaff = idStaff;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public Staff() {
        this.idStaff = UUID.randomUUID().toString();
    }

    public String getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(String idStaff) {
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

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
