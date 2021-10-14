package com.example.actuator.demo.controller;

import com.example.actuator.demo.dao.TicketBookingDao;
import com.example.actuator.demo.model.Greeting;
import com.example.actuator.demo.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {

    @Autowired
    private TicketBookingDao ticketBookingDao;

    @GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("greeting", new Greeting());
        model.addAttribute("roles", Role.values());
        return "greeting";
    }

    @PostMapping("/greeting")
    public ModelAndView greetingSubmit(@ModelAttribute Greeting greeting) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("greeting", greeting);
        modelAndView.setViewName("redirect:/greeting");
        return modelAndView;
    }

    @GetMapping("/allTickets")
    public String allTickets(Model model) {
        model.addAttribute("tickets", ticketBookingDao.findAll());
        model.addAttribute("name", "Hello Mustache");
        return "greeting";
    }
}
