package com.fjgonmir.landom.roomwebapp.services;

import com.fjgonmir.landom.roomwebapp.models.Staff;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StaffServices {

    private static List<Staff> staffs = new ArrayList<>();

    static {
        for (int i = 0; i < 10; i++) {
            staffs.add(new Staff(i, "name" + i, "last name" + i, "position" + i));
        }
    }

    public List<Staff> getAllStaff(){
        return staffs;
    }
}
