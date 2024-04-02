package com.example.chat.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/connection-check-temp")
@Log4j
public class ConnectionCheckTempRestController {

      @GetMapping
      public ResponseEntity<String> connectionCheck() {
//          log.info("Connection check");
          return ResponseEntity.ok("Connection check");
      }
}
