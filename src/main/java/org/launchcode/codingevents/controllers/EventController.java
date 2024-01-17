package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping
    public String events(Model model) {
        ArrayList<String> eventNames = new ArrayList<>();
        eventNames.add("Stanley Cup");
        eventNames.add("World Cup");
        eventNames.add("Superbowl");
        eventNames.add("World Series");

        model.addAttribute("events", eventNames);
        return "events/index";
    }
}
