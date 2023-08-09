package org.example.coffe;

public abstract class CondimentDecorator extends Beverage{
    Beverage beverage;

    public abstract String getDesc();
}
