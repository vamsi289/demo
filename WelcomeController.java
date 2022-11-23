package com.sb.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
 
    @Value("${message}")
    String message;
    
    @Value("${message1}")
    String message1;
    
    @Value("${message2}")
    String message2;
   
    
   
 
    @GetMapping("/welcome")
    public String getMessage()
    {
        return "Hi "+message   + "  "+message1 +  "  "+message2;
    }
}