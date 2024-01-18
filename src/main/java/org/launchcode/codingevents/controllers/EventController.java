package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Chris Bay
 */
@Controller
@RequestMapping("events")
public class EventController {

    public static HashMap<String, String> events = new HashMap<>();


    @GetMapping
    public String displayAllEvents(Model model) {
        events.put("Code and Coffee", "Relaxed meetup with like-minded individuals");
        events.put("Advent of Code", "Daily coding challenges for the month of December");
        events.put("Hacktoberfest", "Month-long celebration of open-sourced software");

        model.addAttribute("title", "All Events");
        model.addAttribute("events", events);
        return "events/index";
    }

    @GetMapping("create")
    public String displayCreateEventForm(Model model) {
        model.addAttribute("title", "Create Event");
        return "events/create";
    }

    @PostMapping("create")
    public String processCreateEventForm(@RequestParam String eventName, String eventDescription) {
        //events.add(eventName);
        events.put(eventName, eventDescription);
        return "redirect:/events";
    }

}
