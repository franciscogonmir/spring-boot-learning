package com.fjgonmir.landom.roomwebapp.Repository;

import com.fjgonmir.landom.roomwebapp.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room,Long> {
}
