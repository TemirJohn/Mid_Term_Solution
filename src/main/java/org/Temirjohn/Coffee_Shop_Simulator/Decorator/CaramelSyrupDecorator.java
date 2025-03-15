package org.Temirjohn.Coffee_Shop_Simulator.Decorator;

import org.Temirjohn.Coffee_Shop_Simulator.Coffee.*;


public class CaramelSyrupDecorator extends CoffeeDecorator {
    public CaramelSyrupDecorator(Coffee coffee) { super(coffee); }
    public double getCost() { return super.getCost() + 0.75; }
    public String getDescription() { return super.getDescription() + ", Caramel Syrup"; }

}
