package com.practice.behaviroal.patterns.template.exercise.solution;

public class ChatWindow extends Window {
    @Override
    protected void onClosed() {
        System.out.println("Disconnecting from the server...");
    }
}
