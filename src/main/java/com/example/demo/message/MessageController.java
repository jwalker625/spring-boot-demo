package com.example.demo.message;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/messages")
public class MessageController {
  @GetMapping
  public ResponseEntity<String> getMessage() {
    return ResponseEntity.ok("Hello, World!");
  }
}