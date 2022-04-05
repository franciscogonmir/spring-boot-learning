package com.fjgonmir.landom.roomwebapp.controllers;

import com.fjgonmir.landom.roomwebapp.models.Staff;
import com.fjgonmir.landom.roomwebapp.services.StaffServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/staff")
public class StaffController {

    private StaffServices staffServices;

    @Autowired
    public StaffController(StaffServices staffServices) {
        this.staffServices = staffServices;
    }

    @GetMapping
    public String getAllStaff(Model model) {
        model.addAttribute("staffs", staffServices.getAllStaff());
        return "staff";
    }
}
