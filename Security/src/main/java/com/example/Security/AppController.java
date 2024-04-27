package com.example.Security;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class AppController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the application";
    }

    @GetMapping("/student")
    @PreAuthorize("hasAuthority('STUDENT')")
    public String welcomeStudent() {
        return "Welcome student";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String welcomeAdmin() {
        return "Welcome admin";
    }
}
