package com.practice.behaviroal.patterns.chainOfResponsibility.Exercise;

import com.practice.behaviroal.patterns.chainOfResponsibility.Handler;
import com.practice.behaviroal.patterns.chainOfResponsibility.HttpRequest;

import javax.xml.crypto.Data;

public abstract class DataReader {
  /*  public void read(String fileName) {
        if (fileName.endsWith(".xls")) {
            System.out.println("Reading data from an Excel spreadsheet.");
        } else if (fileName.endsWith(".numbers")) {
            System.out.println("Reading data from a Numbers spreadsheet.");
        } else if (fileName.endsWith(".qbw")) {
            System.out.println("Reading data from a QuickBooks file.");
        } else
            throw new UnsupportedOperationException("File format not supported.");
    }*/
        private DataReader next;

        public void setNext(DataReader next){
            this.next = next;
        }

        public void read(String fileName){
            // if doHRead = true, it means we are done processing, so stop it. Continue in case of false
            if (fileName.endsWith(getExtension())){
                this.doRead(fileName);
                return;
            }

            // if not last element, fetch next
            if (next != null)
                next.read(fileName);
            else
                throw new UnsupportedOperationException("File format not supported.");

        }

        protected abstract String getExtension();

        public abstract boolean doRead(String fileName);

}
