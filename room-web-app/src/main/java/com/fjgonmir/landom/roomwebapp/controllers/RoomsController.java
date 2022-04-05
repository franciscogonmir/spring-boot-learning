package com.fjgonmir.landom.roomwebapp.controllers;

import com.fjgonmir.landom.roomwebapp.models.Room;
import com.fjgonmir.landom.roomwebapp.services.RoomServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomsController {

    private RoomServices roomServices;

    @Autowired
    public RoomsController(RoomServices roomServices) {
        this.roomServices = roomServices;
    }

    @GetMapping
    public String getAllRooms(Model model) {
        model.addAttribute("rooms", roomServices.getAllRooms());
        return "rooms";
    }
}
