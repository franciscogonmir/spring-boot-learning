package com.fjgonmir.landom.roomwebapp.services;

import com.fjgonmir.landom.roomwebapp.Repository.StaffRepository;
import com.fjgonmir.landom.roomwebapp.models.Staff;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServices {

    private final StaffRepository staffRepository;

    public StaffServices(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }


    public List<Staff> getAllStaff() {
        return staffRepository.findAll();
    }
}
