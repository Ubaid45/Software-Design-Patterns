package com.practice.structural.patterns.adapter.filters;

import com.practice.structural.patterns.adapter.filters.thirdPartyFilters.Caramel;

// Inheritence will work here, but if Filter was abstract class instead of Interface,
// java doesn't support multiple inheritence, so it would be broken.
public class CaramelAdapter extends Caramel implements Filter {
    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
