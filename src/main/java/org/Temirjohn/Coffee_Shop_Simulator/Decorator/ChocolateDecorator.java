package org.Temirjohn.Coffee_Shop_Simulator.Decorator;

import org.Temirjohn.Coffee_Shop_Simulator.Coffee.*;

public class ChocolateDecorator extends CoffeeDecorator {
    public ChocolateDecorator(Coffee coffee) { super(coffee); }
    public double getCost() { return super.getCost() + 0.7; }
    public String getDescription() { return super.getDescription() + ", Chocolate Syrup"; }
}
