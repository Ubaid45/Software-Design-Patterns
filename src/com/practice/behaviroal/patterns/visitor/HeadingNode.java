package com.practice.behaviroal.patterns.visitor;

public class HeadingNode implements HtmlNode {
  @Override
  public void execute(Operation operation) {
    operation.apply(this);
  }
}
