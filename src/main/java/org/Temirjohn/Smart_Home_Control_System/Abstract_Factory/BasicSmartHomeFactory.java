package org.Temirjohn.Smart_Home_Control_System.Abstract_Factory;

import org.Temirjohn.Smart_Home_Control_System.Adapter.HeaterAdapter;
import org.Temirjohn.Smart_Home_Control_System.Adapter.ThirdPartyHeater;
import org.Temirjohn.Smart_Home_Control_System.Composite.Light;
import org.Temirjohn.Smart_Home_Control_System.Composite.SecurityCamera;
import org.Temirjohn.Smart_Home_Control_System.Composite.SmartDevice;

public class BasicSmartHomeFactory implements SmartHomeFactory {
    public SmartDevice createLight() { return new Light(); }
    public SmartDevice createSecurityCamera() { return new SecurityCamera(); }
    public SmartDevice createHeater() { return new HeaterAdapter(new ThirdPartyHeater()); }

}
