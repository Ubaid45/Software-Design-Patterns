package com.practice.behaviroal.patterns.command;


import com.practice.behaviroal.patterns.command.fx.Command;

public class BlackAndWhiteCommand implements Command {
  @Override
  public void execute() {
    System.out.println("Black and white");
  }
}
