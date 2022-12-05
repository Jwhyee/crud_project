package com.sgp.crudproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// Controller, Service, Repository, Entity
@Controller
public class MainController {

    @GetMapping("/")
    public String showMainPage() {
        return "index";
    }

}
