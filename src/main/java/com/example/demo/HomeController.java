package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class HomeController {

    @Autowired
    FlightRepository flightRepository;

    @RequestMapping("/")
    public String listFlight(Model model){
        model.addAttribute("flights", flightRepository.findAll());
        return "list";

    }
    @GetMapping("/add")
        public String flightFrom(Model model){
        model.addAttribute("flight", new Flight());
        return "flightform";
        }

        @PostMapping("/process")
    public String processForm(@Valid Flight flight, BindingResult result){
            if (result.hasErrors()){
        return "flightform";

    }
    flightRepository.save(flight);
    return "redirect:/";
}
}
