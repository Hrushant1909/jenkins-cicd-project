package com.example.cicd_backend.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello")
    public Map<String, String> hello() {
        return Map.of(
                "message", "Hello from Mini CI/CD Backend"
        );
    }

    @GetMapping("/info")
    public Map<String, String> info() {
        return Map.of(
                "application", "Mini CI/CD Project",
                "environment", "development"
        );
    }

    @GetMapping("/status")
    public Map<String, String> status() {
        return Map.of(
                "status", "UP",
                "version", "1.0.0"
        );
    }

    @PostMapping("/message")
    public Map<String, String> message(
            @RequestBody Map<String, String> request) {

        return Map.of(
                "message",
                "Received: " + request.getOrDefault("message", "")
        );
    }
}