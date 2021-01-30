package com.practice.structural.patterns.adapter.filters.thirdPartyFilters;

import com.practice.structural.patterns.adapter.filters.Image;

public class Caramel {
    public void init(){

    }

    public void render(Image image){
        System.out.println("Applying caramel filter");
    }
}
