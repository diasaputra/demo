package com.example.demo.service;

public interface PasswordResetService {
    void requestPasswordReset(String email);
    boolean resetPassword(String token, String newPassword);
}
