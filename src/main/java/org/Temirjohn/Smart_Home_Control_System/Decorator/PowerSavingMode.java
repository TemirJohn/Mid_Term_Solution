package org.Temirjohn.Smart_Home_Control_System.Decorator;

import org.Temirjohn.Smart_Home_Control_System.Composite.SmartDevice;

class PowerSavingMode extends DeviceDecorator {
    public PowerSavingMode(SmartDevice device) { super(device); }

    public void turnOn() {
        System.out.println("Power-saving mode enabled");
        super.turnOn();
    }

    public void turnOff() {
        System.out.println("Device is now in low-power state");
        super.turnOff();
    }
}
