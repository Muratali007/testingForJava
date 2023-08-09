package org.example.coffe;

public class Soy extends CondimentDecorator{
    @Override
    public double cost() {
        return beverage.cost()+0.10;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ", Soy";
    }

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
}
