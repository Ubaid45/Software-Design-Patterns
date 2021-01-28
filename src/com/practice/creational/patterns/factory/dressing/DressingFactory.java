package com.practice.creational.patterns.factory.dressing;

public class DressingFactory extends BasicDressing {

    @Override
    public Dressing createDressing(DressingType dressingType) {
        Dressing dressing;
        switch (dressingType){
            case Combo :
                dressing= new Combo();
                break;
            case Casual :
                dressing= new Casual();
                break;
            case Formal :
                dressing= new Formal();
                break;
            default:
                throw new IllegalArgumentException("No such product exitsts.");
        }
        dressing.Shirt();
        dressing.Pants();
        dressing.Shoes();

        return dressing;
    }
}
