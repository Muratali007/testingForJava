package org.example.coffe;

public class HouseBlend extends Beverage{
    @Override
    public double cost() {
        return 0.89;
    }

    public HouseBlend() {
        desc = "House Blend Coffee";
    }
}
