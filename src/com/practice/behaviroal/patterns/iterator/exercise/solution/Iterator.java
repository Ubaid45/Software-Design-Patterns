package com.practice.behaviroal.patterns.iterator.exercise.solution;

public interface Iterator {
  boolean hasNext();
  Product current();
  void next();
}
