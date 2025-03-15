package org.Temirjohn.Smart_Home_Control_System.Facade;

import org.Temirjohn.Smart_Home_Control_System.Composite.SmartDevice;
import java.util.*;

public class SmartHomeFacade {
    private List<SmartDevice> devices = new ArrayList<>();

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void turnOnAll() {
        devices.forEach(SmartDevice::turnOn);
    }

    public void turnOffAll() {
        devices.forEach(SmartDevice::turnOff);
    }

    public void showStatus() {
        devices.forEach(device -> System.out.println(device.getStatus()));
    }
}