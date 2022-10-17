package com.example.sweat.controller;

import com.example.sweat.domain.Message;
import com.example.sweat.repository.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Vladislav Domaniewski
 */

@Controller
@RequestMapping("/greeting")

public class MessageController {
    @Autowired
    private MessageRepo messageRepo;

    @GetMapping("/hel")
    public String retMet(@RequestParam(name = "name", required = false) String name,
                         Model model) {
        model.addAttribute("name", name);
        return "message";
    }


    @GetMapping("/find-all")
    public String showAll(Model model) {
        Iterable<Message> messages = messageRepo.findAll();
        model.addAttribute("messages" , messages);
        return "message";
    }


    @PostMapping("/added-model")
    public String addDataBaseObj(@ModelAttribute Message message,
                                 Model model) {
        Message message1 = messageRepo.save(message);
        model.addAttribute("message", message1);
        return "message";
    }


}

