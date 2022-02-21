package com.fjgonmir.landom.roomwebapp.controllers;

import com.fjgonmir.landom.roomwebapp.models.Room;
import com.fjgonmir.landom.roomwebapp.services.RoomServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomRestController {

    private RoomServices roomServices;

    @Autowired
    public RoomRestController(RoomServices roomServices) {
        this.roomServices = roomServices;
    }


    @GetMapping
    public List<Room> getAllRooms() {
        return roomServices.getAllRooms();
    }
}
