package com.practice.behaviroal.patterns.visitor.exercise.solution;

public interface AudioFilter {
    void apply(FormatSegment formatSegment);
    void apply(FactSegment factSegment);
}
