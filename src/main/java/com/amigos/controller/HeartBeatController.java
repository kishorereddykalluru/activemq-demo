package com.amigos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeartBeatController {

    @GetMapping("/heartbeat")
    public String runHeartBeat() {
        return "UP";
    }
}
