package org.Temirjohn.Smart_Home_Control_System.Decorator;

import org.Temirjohn.Smart_Home_Control_System.Composite.SmartDevice;

abstract class DeviceDecorator implements SmartDevice {
    protected SmartDevice device;

    public DeviceDecorator(SmartDevice device) { this.device = device; }

    public void turnOn() { device.turnOn(); }
    public void turnOff() { device.turnOff(); }
    public String getStatus() { return device.getStatus(); }
}
