package com.practice.behaviroal.patterns.visitor.exercise.solution;

public class FormatSegment extends Segment {
  @Override
  public void applyFilter(AudioFilter filter) {
    filter.apply(this);
  }
}
