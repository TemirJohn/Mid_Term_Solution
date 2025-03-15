package org.Temirjohn.Coffee_Shop_Simulator.Decorator;

import org.Temirjohn.Coffee_Shop_Simulator.Coffee.*;


public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) { super(coffee); }
    public double getCost() { return super.getCost() + 0.5; }
    public String getDescription() { return super.getDescription() + ", Steamed Milk"; }

}
