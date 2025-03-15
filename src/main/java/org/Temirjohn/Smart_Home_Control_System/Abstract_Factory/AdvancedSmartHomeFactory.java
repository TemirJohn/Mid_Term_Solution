package org.Temirjohn.Smart_Home_Control_System.Abstract_Factory;

import org.Temirjohn.Smart_Home_Control_System.Adapter.HeaterAdapter;
import org.Temirjohn.Smart_Home_Control_System.Adapter.ThirdPartyHeater;
import org.Temirjohn.Smart_Home_Control_System.Composite.*;
import org.Temirjohn.Smart_Home_Control_System.Decorator.ScheduledDevice;

public class AdvancedSmartHomeFactory implements SmartHomeFactory {
    public SmartDevice createLight() { return new SmartLight();}
    public SmartDevice createSecurityCamera() { return new AppleSecurityCamera(); }
    public SmartDevice createHeater() { return new HeaterAdapter(new ThirdPartyHeater()); }
}
