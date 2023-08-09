package org.example.coffe;

public class Mocha extends CondimentDecorator{
    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ",Mocha";
    }

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
}
