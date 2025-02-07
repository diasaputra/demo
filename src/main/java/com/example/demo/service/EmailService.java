package com.example.demo.service;

import com.example.demo.entity.EmailDetails;

public interface EmailService {
    String sendSimpleMail(EmailDetails details);
    String sendMailWithAttachment(EmailDetails details);
    void sendResetEmail(String to, String token);
}
