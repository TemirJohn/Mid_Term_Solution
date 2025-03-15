package org.Temirjohn.Smart_Home_Control_System.Composite;

public class Light implements SmartDevice{
    String name = "Light";
    boolean isOn;


    public void turnOn() {
        isOn = true;
        System.out.println(name + " turned on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(name + " turned off");
    }

    public String getStatus() {
        return name + " is " + (isOn ? "ON" : "OFF");
    }
}
