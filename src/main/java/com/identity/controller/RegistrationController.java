package com.identity.controller;

import com.identity.dto.RegistrationDto;
import com.identity.service.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * @author Philémon Globléhi <philemon.globlehi@gmail.com>
 */
@RestController
@RequestMapping(path = "api/v1/registration", name = "app_")
@AllArgsConstructor
public class RegistrationController {
    private final RegistrationService registrationService;

    @PostMapping(name = "user_create")
    public String register(@RequestBody RegistrationDto request) {
        return registrationService.register(request);
    }

    @GetMapping(path = "confirm", name = "token_confirm")
    public String confirm(@RequestParam("token") String token) {
        return registrationService.confirmToken(token);
    }
}
