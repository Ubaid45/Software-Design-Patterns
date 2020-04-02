package com.practice.behaviroal.patterns.command;


import com.practice.behaviroal.patterns.command.fx.Command;

public class ResizeCommand implements Command {
  @Override
  public void execute() {
    System.out.println("Resize");
  }
}
