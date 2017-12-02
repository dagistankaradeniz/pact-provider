package com.example.pact.provider;

public class SsnValidator {
    public static void validate(String ssn) {
        if (ssn == null) {
            throw new ValidationException("SSN cannot be null");
        }
    }
}
