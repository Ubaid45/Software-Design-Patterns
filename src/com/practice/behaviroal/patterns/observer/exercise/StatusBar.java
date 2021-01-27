package com.practice.behaviroal.patterns.observer.exercise;

import java.util.ArrayList;
import java.util.List;

public class StatusBar {
    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public void show() {
        for (Stock stock : stocks)
            System.out.println(stock);
    }
}
