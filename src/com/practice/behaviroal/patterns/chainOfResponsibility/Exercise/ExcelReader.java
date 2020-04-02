package com.practice.behaviroal.patterns.chainOfResponsibility.Exercise;

public class ExcelReader extends DataReader {

    @Override
    protected String getExtension() {
        return ".xls";
    }

    @Override
    public boolean doRead(String fileName) {
        System.out.println("Reading data from excel file.");
        return false;
    }
}
