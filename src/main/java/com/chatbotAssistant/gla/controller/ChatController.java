package com.chatbotAssistant.gla.controller;

import com.chatbotAssistant.gla.model.ChatRequest;
import com.chatbotAssistant.gla.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chat")
@CrossOrigin(origins = "http://localhost:3000")

public class ChatController {

    @Autowired
    private ChatService chatService;

    @PostMapping
    public String chat(@RequestBody ChatRequest request) {

        return chatService.getResponse(request.getMessage());
    }
}