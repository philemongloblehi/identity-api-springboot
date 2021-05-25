package com.identity.validator;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;

/**
 * @author Philémon Globléhi <philemon.globlehi@gmail.com>
 */
@Service
public class EmailValidator implements Predicate<String> {
    @Override
    public boolean test(String s) {
//        TODO: Regex to validate email
        return true;
    }
}
