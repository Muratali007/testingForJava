package org.example.coffe;

public class Decaf extends Beverage{
    @Override
    public double cost() {
        return 1.05;
    }

    public Decaf () {
        desc = "Decaf coffee";
    }
}
