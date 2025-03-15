package org.Temirjohn.Smart_Home_Control_System.Abstract_Factory;

import org.Temirjohn.Smart_Home_Control_System.Composite.SmartDevice;

public interface SmartHomeFactory {
    SmartDevice createLight();
    SmartDevice createSecurityCamera();
    SmartDevice createHeater();
}

