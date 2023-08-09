package org.example.coffe;

public class Espresso extends Beverage{
    @Override
    public double cost() {
        return 1.99;
    }

    public Espresso() {
        desc = "Espresso";
    }
}
