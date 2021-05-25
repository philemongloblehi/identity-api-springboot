package com.identity.controller;

import com.identity.dto.RegistrationDto;
import com.identity.service.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Philémon Globléhi <philemon.globlehi@gmail.com>
 */
@RestController
@RequestMapping(path = "api/v1/registration", name = "app_user_")
@AllArgsConstructor
public class RegistrationController {
    private RegistrationService registrationService;

    @PostMapping(name = "create")
    public String register(@RequestBody RegistrationDto request) {
        return registrationService.register(request);
    }
}
