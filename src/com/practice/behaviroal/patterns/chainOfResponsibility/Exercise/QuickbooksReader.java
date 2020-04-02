package com.practice.behaviroal.patterns.chainOfResponsibility.Exercise;

import com.practice.behaviroal.patterns.state.Exercise.Context;

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
