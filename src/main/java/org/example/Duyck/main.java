package org.example.Duyck;

import org.example.Duyck.Duck;
import org.example.Duyck.FlyRocketPowered;
import org.example.Duyck.MallarDuck;
import org.example.Duyck.ModelDuck;

public class main {
    public static void main(String[] args) {
        Duck mallarDuck = new MallarDuck();
        mallarDuck.performFly();
        mallarDuck.performQuack();
        mallarDuck.display();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
