package SmartHomeSystem;

import org.w3c.dom.ls.LSOutput;

public class SmartLight implements SmartDevice {
    boolean isOn;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Smart light is now ON");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Smart light is now OFF");
    }

    @Override
    public void getStatus() {
        if(isOn) {
            System.out.println("Smart light is ON");
        } else {
            System.out.println("Smart light is OFF");
        }
    }
}
