package com.identity.service;

import com.identity.dto.RegistrationDto;
import com.identity.entity.User;
import com.identity.utils.enums.UserRole;
import com.identity.validator.EmailValidator;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Philémon Globléhi <philemon.globlehi@gmail.com>
 */
@Service
@AllArgsConstructor
public class RegistrationService {
    private final UserService userService;
    private final EmailValidator emailValidator;

    public String register(RegistrationDto request) {
        boolean isValidEmail = emailValidator.test(request.getEmail());
        if (!isValidEmail) {
            throw new IllegalStateException("email not valid");
        }

        return userService.signUpUser(
                new User(
                        request.getFirstName(),
                        request.getLastName(),
                        request.getEmail(),
                        request.getPassword(),
                        UserRole.ROLE_USER
                )
        );
    }
}
