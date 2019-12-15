package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

    private static List<String> events = new ArrayList<>();

//    @GetMapping
//    public String displayAllEvents(Model model) {
//        model.addAttribute("events", events);
//        return "events/index";
//    }

    @GetMapping
    public String displayAllEvents(Model model) {
        HashMap<String, String> theEvents = new HashMap<String, String>();
        theEvents.put("Code with Pride", "St. Louis coding event");
        theEvents.put("Hackathon", "UMSL student coding event");
        theEvents.put("Coder Girl", "LaunchCode coding event");
        model.addAttribute("events", theEvents);
        return "events/index";
    }

    @GetMapping("create")
    public String displayCreateEventForm(Model model) {
        model.addAttribute("title", "Create Event");
        return "events/create";
    }

    @PostMapping("create")
    public String processCreateEventForm(@RequestParam String eventName) {
        events.add(eventName);
        return "redirect:";
    }

}
