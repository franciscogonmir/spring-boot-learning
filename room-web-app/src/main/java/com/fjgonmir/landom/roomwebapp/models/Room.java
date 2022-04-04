package com.fjgonmir.landom.roomwebapp.models;

import javax.persistence.*;

@Entity
@Table(name = "ROOM")
public class Room {

    @Id
    @Column(name = "ROOM_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "BED_INFO")
    private String info;
    @Column(name = "ROOM_NUMBER")
    private String roomNumber;

    public Room() {
    }

    public Room(long id, String name, String info, String roomNumber) {
        this.id = id;
        this.name = name;
        this.info = info;
        this.roomNumber = roomNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getRoomNumber() {
        return this.roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
}
