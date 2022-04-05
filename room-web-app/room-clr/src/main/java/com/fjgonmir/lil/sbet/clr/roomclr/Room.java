package com.fjgonmir.lil.sbet.clr.roomclr;

public class Room {

    private long id;
    private String name;
    private String info;
    private Integer number;

    public Room() {
    }

    public Room(long id, String name, String info, Integer number) {
        this.id = id;
        this.name = name;
        this.info = info;
        this.number = number;
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

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", info='" + info + '\'' +
                ", number=" + number +
                '}';
    }
}
