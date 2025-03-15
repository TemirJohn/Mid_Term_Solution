package org.Temirjohn.Smart_Home_Control_System.Adapter;

import org.Temirjohn.Smart_Home_Control_System.Composite.SmartDevice;

public class HeaterAdapter implements SmartDevice {
    private ThirdPartyHeater heater;

    public HeaterAdapter(ThirdPartyHeater heater) {
        this.heater = heater;
    }

    public void turnOn() { heater.start(); }
    public void turnOff() { heater.stop(); }
    public String getStatus() { return "Third-party heater (controlled via adapter)"; }
}