package com.practice.structural.patterns.proxy.exercise.solution;

public class Product {
  private int id;
  private String name;

  public Product(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
