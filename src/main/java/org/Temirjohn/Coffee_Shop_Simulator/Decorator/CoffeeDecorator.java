package org.Temirjohn.Coffee_Shop_Simulator.Decorator;

import org.Temirjohn.Coffee_Shop_Simulator.Coffee.Coffee;

public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;
    public CoffeeDecorator(Coffee coffee) { this.coffee = coffee; }
    public double getCost() { return coffee.getCost(); }
    public String getDescription() { return coffee.getDescription(); }

}
