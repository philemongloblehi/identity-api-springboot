package com.identity.email;

/**
 * @author Philémon Globléhi <philemon.globlehi@gmail.com>
 */
public interface EmailSender {
    public void send(String to, String email);
}
