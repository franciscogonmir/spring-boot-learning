package com.fjgonmir.landom.roomwebapp.services;

import com.fjgonmir.landom.roomwebapp.models.Room;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomServices {

    private static List<Room> rooms = new ArrayList<>();

    static {
        for (int i = 0; i < 10; i++) {
            rooms.add(new Room(i, "Name" + i, "info" + i, i));
        }
    }

    public List<Room> getAllRooms(){
        return rooms;
    }
}