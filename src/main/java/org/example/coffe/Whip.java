package org.example.coffe;

public class Whip extends CondimentDecorator{
    @Override
    public double cost() {
        return beverage.cost()+0.15;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ", Whip";
    }

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
}
