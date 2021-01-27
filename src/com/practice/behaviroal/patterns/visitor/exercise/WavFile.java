package com.practice.behaviroal.patterns.visitor.exercise;

import java.util.ArrayList;
import java.util.List;

public class WavFile {
    private List<Segment> segments = new ArrayList<>();

    public static WavFile read(String fileName) {
        // Simulate reading a wav file and building the segments
        WavFile wavFile = new WavFile();
        wavFile.segments.add(new FormatSegment());
        wavFile.segments.add(new FactSegment());
        wavFile.segments.add(new FactSegment());
        wavFile.segments.add(new FactSegment());

        return wavFile;
    }

    public void reduceNoise() {
        for (Segment segment : segments)
            segment.reduceNoise();
    }

    public void addReverb() {
        for (Segment segment : segments)
            segment.addReverb();
    }

    public void normalize() {
        for (Segment segment : segments)
            segment.normalize();
    }
}
