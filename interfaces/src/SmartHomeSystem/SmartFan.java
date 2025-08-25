package SmartHomeSystem;

public class SmartFan implements SmartDevice {
    int speed;

    SmartFan(int speed) {
        this.speed = speed;
    }

    @Override
    public void turnOn() {
        if(speed != 0){
            System.out.println("Smart Fan is now ON at speed " + speed);
        }
    }

    @Override
    public void turnOff() {
        speed = 0;
        System.out.println("Smart Fan is now OFF");
    }

    @Override
    public void getStatus() {
        if(speed != 0) {
            System.out.println("ON at speed " + speed);
        } else {
            System.out.println("OFF");
        }
    }
}
