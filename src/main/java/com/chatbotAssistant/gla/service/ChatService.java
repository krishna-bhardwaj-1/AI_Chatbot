package com.chatbotAssistant.gla.service;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    public String getResponse(String message) {

        message = message.toLowerCase();
        if(message.contains("hello")||message.contains("hi")){
            return "Hello Krishna ! how can i help You ?";
        }
        if(message.contains("fee")) {
            return "The fee for CSE is around ₹1,20,000 per year.";
        }

        if(message.contains("placement")) {
            return "Our college average package is around 6 LPA.";
        }

        if(message.contains("course")) {
            return "We offer B.Tech, BCA, MCA and MBA.";
        }

        return "Sorry, I could not understand your query.";
    }
}