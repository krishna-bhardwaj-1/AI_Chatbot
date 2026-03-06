package com.chatbotAssistant.gla.service;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    public String getResponse(String message) {

        message = message.toLowerCase();
       if(message.contains("hello") || message.contains("hi")){
            return "Hello! I am your College AI Assistant. How can I help you?";
        }
        if(message.contains("fee")) {
            if(message.contains("cse")){
                return "The fee for B.Tech CSE is around ₹2,45,000 per year.";
            }
            else if(message.contains("mba")){
                return "The fee for MCA is around ₹2,75,000 per year.";
            }
            else if(message.contains("bca")){
                return "The fee for BCA is around ₹1,20,000 per year.";
            }
            else if(message.contains("mca")){
                return "The fee for MCA is around ₹1,53,000 per year.";
            }
            else{
                return "Fees depending on the course. Please specify CSE, MBA, BCA or MCA.";
            }
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
