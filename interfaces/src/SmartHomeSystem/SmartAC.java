package SmartHomeSystem;

public class SmartAC implements SmartDevice {
    boolean isOn;
    int temp = 24;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Smart AC is now ON at " + temp + "°C");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Smart AC is now OFF");
    }

    @Override
    public void getStatus() {
        if(isOn) {
            System.out.println("Smart AC is ON");
        } else {
            System.out.println("Smart AC is OFF");
        }
    }
}
