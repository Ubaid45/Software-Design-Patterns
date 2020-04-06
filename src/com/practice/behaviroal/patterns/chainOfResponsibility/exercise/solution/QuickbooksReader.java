package com.practice.behaviroal.patterns.chainOfResponsibility.exercise.solution;

public class QuickbooksReader extends DataReader {

    @Override
    protected String getExtension() {
        return ".qbw";
    }

    @Override
    public boolean doRead(String fileName) {
        System.out.println("Reading data from Qbook file.");
        return false;
    }
}
