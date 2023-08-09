package org.example.coffe;

public abstract class CondimentDecorator extends Beverage{
    Beverage beverage;

    public abstract String getDesc();

    public Size getSize() {
        return beverage.getSize();
    }

    public class Soy extends CondimentDecorator {
        public Soy(Beverage beverage) {
            this.beverage = beverage;
        }

        public String getDesc() {
            return beverage.getDesc() + ", Soy";
        }

        public double cost() {
            double cost = beverage.cost();
            if (beverage.getSize() == Size.TALL) {
                cost += .10;
            }else if (beverage.getSize() == Size.GRANDE) {
                cost += .15;
            } else if (beverage.getSize() == Size.VENTI) {
                cost += .20;
            }
            return cost;
        }
    }
}
