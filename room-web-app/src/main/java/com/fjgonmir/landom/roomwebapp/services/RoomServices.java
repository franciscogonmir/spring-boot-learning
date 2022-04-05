package com.fjgonmir.landom.roomwebapp.services;

import com.fjgonmir.landom.roomwebapp.Repository.RoomRepository;
import com.fjgonmir.landom.roomwebapp.models.Room;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class RoomServices {

    private final RoomRepository roomRepository;

    public RoomServices(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Transactional(readOnly = true)
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Room getById(long id) {
        Optional<Room> room = roomRepository.findById(id);
        return room.orElseGet(Room::new);
    }
}
