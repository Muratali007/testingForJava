package org.example.Duyck;

public class MallarDuck extends Duck {
    public MallarDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("I AM REAL MALLARD DUCK");
    }
}
