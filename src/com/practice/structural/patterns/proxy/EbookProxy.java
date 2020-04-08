package com.practice.structural.patterns.proxy;

public class EbookProxy implements Ebook {
    private String fileName;
    private RealEbook ebook; // Dont initialize it, only initialize when needed

    public EbookProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        if(ebook == null)  // Lazy initialization
            ebook = new RealEbook(fileName);

        ebook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
