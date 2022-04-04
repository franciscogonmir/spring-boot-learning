package com.fjgonmir.landom.roomwebapp.services;

import com.fjgonmir.landom.roomwebapp.Repository.RoomRepository;
import com.fjgonmir.landom.roomwebapp.models.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomServices {

    private final RoomRepository roomRepository;

    public RoomServices(RoomRepository roomRepository){
        this.roomRepository = roomRepository;
    }

    @Transactional(readOnly = true)
    public List<Room> getAllRooms(){
        return roomRepository.findAll();
    }
}
