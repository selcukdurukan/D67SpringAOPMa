package com.ba.boost.d67springaopibrahim.aopservice;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public String giveMessage(String p) {
        System.out.println("Param of Method: " + p);
        return p;
    }
}
