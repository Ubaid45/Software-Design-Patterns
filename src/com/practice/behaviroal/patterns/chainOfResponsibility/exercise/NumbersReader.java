package com.practice.behaviroal.patterns.chainOfResponsibility.exercise;

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
