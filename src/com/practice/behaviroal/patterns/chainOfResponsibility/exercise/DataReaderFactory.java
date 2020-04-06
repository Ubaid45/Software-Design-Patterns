package com.practice.behaviroal.patterns.chainOfResponsibility.exercise;

public class DataReaderFactory {
    public static DataReader getDataReaderChain(){
        var excelReader = new ExcelReader();
        var numbersReader = new NumbersReader();
        var quickBooksReader = new QuickbooksReader();

        quickBooksReader.setNext(numbersReader);
        numbersReader.setNext(excelReader);

        return quickBooksReader;
    }

}
