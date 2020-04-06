package com.practice.behaviroal.patterns.chainOfResponsibility.exercise.solution;

public class NumbersReader extends DataReader {

    @Override
    protected String getExtension() {
        return ".numbers";
    }

    @Override
    public boolean doRead(String fileName) {
        System.out.println("Reading data from Numbers file.");
        return false;
    }
}
