package com.example.cicd_backend;


import com.example.cicd_backend.controller.ApiController;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ApiControllerTest {

    private final ApiController controller = new ApiController();

    @Test
    void helloShouldReturnMessage() {

        Map<String, String> response = controller.hello();

        assertEquals(
                "Hello from Mini CI/CD Backend",
                response.get("message")
        );
    }

    @Test
    void statusShouldReturnUp() {

        Map<String, String> response = controller.status();

        assertEquals("UP", response.get("status"));
    }
}