package com.practice.structural.patterns.adapter.exercise.solution;

import com.practice.structural.patterns.adapter.exercise.EmailClient;
import com.practice.structural.patterns.adapter.exercise.EmailProvider;
import com.practice.structural.patterns.adapter.exercise.Gmail.GmailClient;

public class GmailAdapter implements EmailProvider {
    private GmailClient gmailClient = new GmailClient();

    @Override
    public void downloadEmails() {
        gmailClient.connect();
        gmailClient.getEmails();
        gmailClient.disconnect();
    }
}
