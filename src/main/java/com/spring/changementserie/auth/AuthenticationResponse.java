package com.spring.changementserie.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class AuthenticationResponse {
    private String token;
    private String status;
    private  String message;

    public AuthenticationResponse(String status, String message, String token) {
        this.status = status;
        this.message = message;
        this.token = token;
    }
}
