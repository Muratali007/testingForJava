package org.example.coffe;

public abstract class Beverage {
    public enum Size{ TALL, GRANDE, VENTI };

    Size size = Size.TALL;
    String desc = "Unknown Beverage";

    public String getDesc() {
        return desc;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();
}
