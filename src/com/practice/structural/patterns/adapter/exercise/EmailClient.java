package com.practice.structural.patterns.adapter.exercise;

import com.practice.structural.patterns.adapter.exercise.Gmail.GmailClient;
import com.practice.structural.patterns.adapter.exercise.solution.GmailAdapter;

import java.util.ArrayList;
import java.util.List;

public class EmailClient {
  private List<EmailProvider> providers = new ArrayList<>();

  public void addProvider(EmailProvider provider) {
    providers.add(provider);
  }

  public void downloadEmails() {
    for (var provider : providers)
      provider.downloadEmails();
  }

}
