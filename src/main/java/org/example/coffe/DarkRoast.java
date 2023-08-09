package org.example.coffe;

import java.util.Date;

public class DarkRoast extends Beverage{
    @Override
    public double cost() {
        return 0.99;
    }

    public DarkRoast() {
        desc = "Dark Roast Coffee";
    }
}
