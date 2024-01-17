package com.example.jjwtdeneme.jjwtdeneme.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jjwtdeneme.jjwtdeneme.dto.JwtAuthenticationResponse;
import com.example.jjwtdeneme.jjwtdeneme.dto.SignInRequest;
import com.example.jjwtdeneme.jjwtdeneme.dto.SignUpRequest;
import com.example.jjwtdeneme.jjwtdeneme.services.AuthenticationService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping("/signup")
    public JwtAuthenticationResponse signup(@RequestBody SignUpRequest request) {
        return authenticationService.signup(request);
    }

    @PostMapping("/signin")
    public JwtAuthenticationResponse signin(@RequestBody SignInRequest request) {
        return authenticationService.signin(request);
    }
}