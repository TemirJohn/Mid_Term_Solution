package org.Temirjohn.Smart_Home_Control_System.Decorator;

import org.Temirjohn.Smart_Home_Control_System.Composite.SmartDevice;

public class ScheduledDevice extends DeviceDecorator {
    public ScheduledDevice(SmartDevice device) { super(device); }

    public void turnOn() {
        System.out.println("Scheduled: Turning device ON");
        super.turnOn();
    }

    public void turnOff() {
        System.out.println("Scheduled: Turning device OFF");
        super.turnOff();
    }
}
