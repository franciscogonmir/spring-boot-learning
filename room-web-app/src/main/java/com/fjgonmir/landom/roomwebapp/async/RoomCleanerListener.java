package com.fjgonmir.landom.roomwebapp.async;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fjgonmir.landom.roomwebapp.models.Room;
import com.fjgonmir.landom.roomwebapp.services.RoomServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class RoomCleanerListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(RoomCleanerListener.class);

    private final ObjectMapper mapper;

    private final RoomServices roomServices;

    public RoomCleanerListener(ObjectMapper mapper, RoomServices roomServices) {
        this.mapper = mapper;
        this.roomServices = roomServices;
    }

    public void receiveMessage(String message){
        try {
            AsyncPayload payload = mapper.readValue(message,AsyncPayload.class);
            if("ROOM".equals(payload.getModel())){
                Room room = roomServices.getById(payload.getId());
                LOGGER.info("ROOM {} : {} needs to be cleaned",room.getRoomNumber(),room.getName());
            }else{
                LOGGER.warn("Unknown model type");
            }
        } catch ( JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
