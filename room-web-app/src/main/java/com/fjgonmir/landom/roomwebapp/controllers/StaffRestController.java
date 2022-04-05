package com.fjgonmir.landom.roomwebapp.controllers;

import com.fjgonmir.landom.roomwebapp.models.Staff;
import com.fjgonmir.landom.roomwebapp.services.StaffServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
public class StaffRestController {
    private StaffServices staffServices;

    @Autowired
    public StaffRestController(StaffServices staffServices) {
        this.staffServices = staffServices;
    }

    @GetMapping
    public List<Staff> getAllStaff() {
        return staffServices.getAllStaff();
    }
}
