package com.practice.structural.patterns.adapter.filters;

import com.practice.structural.patterns.adapter.filters.thirdPartyFilters.Caramel;

public class CaramelFilter implements Filter {
    private Caramel caramel;

    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
}
