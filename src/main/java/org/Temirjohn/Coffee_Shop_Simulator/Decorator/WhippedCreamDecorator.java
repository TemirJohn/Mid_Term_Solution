package org.Temirjohn.Coffee_Shop_Simulator.Decorator;

import org.Temirjohn.Coffee_Shop_Simulator.Coffee.*;

public class WhippedCreamDecorator extends CoffeeDecorator{
    public WhippedCreamDecorator(Coffee coffee) { super(coffee); }
    public double getCost() { return super.getCost() + 1.0; }
    public String getDescription() { return super.getDescription() + ", Whipped Cream"; }

}
