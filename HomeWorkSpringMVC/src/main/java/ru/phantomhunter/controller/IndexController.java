package ru.phantomhunter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.UUID;

@Controller
public class IndexController {
    //@GetMapping("/")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index (Model model){
        model.addAttribute("message","My message plus random UUID -> " + UUID.randomUUID());
        return "index";
    }
}
