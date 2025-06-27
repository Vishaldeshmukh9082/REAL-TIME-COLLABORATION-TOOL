package com.example.demo.controller;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.example.demo.model.Message;

@Controller
public class MessageController {
    @MessageMapping("/edit")
    @SendTo("/topic/updates")
    public Message broadcastEdit(Message message) {
        return message;
    }
}
