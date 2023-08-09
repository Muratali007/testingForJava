package org.example.WeatherData;

import org.example.coffe.*;

public class StarbuzzCoffe {
    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDesc() + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Soy(beverage1);
        System.out.println(beverage1.getDesc() + " $" + beverage1.cost());


        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDesc() + " $" + beverage2.cost());
    }
}
