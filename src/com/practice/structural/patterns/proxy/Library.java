package com.practice.structural.patterns.proxy;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Ebook> ebooks = new HashMap<>();

    public void add(Ebook ebook){
        ebooks.put(ebook.getFileName(), ebook);
    }

    public void openEbook(String fileName){
        //In real word, check for a valid file name
        ebooks.get(fileName).show();
    }
}
