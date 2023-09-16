package com.ba.boost.d67springaopibrahim.api;

import com.ba.boost.d67springaopibrahim.aopservice.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class MessageApi {

    // MessageApi ile ilgili bir talep geldiginde Spring'e MessageService class'ından da bir nesne oluştur diyoruz.
    @Autowired
    private MessageService messageService;

    @PostMapping("/post")
    public ResponseEntity<String> exampleMethod(@RequestBody String message) {
        return ResponseEntity.ok(messageService.giveMessage(message));
    }

    @GetMapping("/get")
    public ResponseEntity<String> exampleMethod2() {
        return ResponseEntity.ok("Hello, World!");
    }

}
