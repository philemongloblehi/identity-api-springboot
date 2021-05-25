package com.identity.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * @author Philémon Globléhi <philemon.globlehi@gmail.com>
 */
@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationDto {
    private final String firstName;
    private final String lastName;
    private final String password;
    private final String email;
}
