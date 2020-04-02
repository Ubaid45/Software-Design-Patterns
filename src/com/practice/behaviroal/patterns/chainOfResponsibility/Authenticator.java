package com.practice.behaviroal.patterns.chainOfResponsibility;


import java.io.Console;

public class Authenticator extends Handler{

    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        // For the purpose of simplicity, if user = admin and password = 1234, user is valid
        var isValid = (request.getUserName() == "admin" &&
                request.getPassword() == "1234");

        System.out.println("Authentication");

        //We are not done processing, return false which means continue
        return !isValid;
    }
}
