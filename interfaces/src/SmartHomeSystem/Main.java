package SmartHomeSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose device: ");
        System.out.println("1. Smart Light \n2. Smart Fan \n3. Smart AC");
        int device = sc.nextInt();

        switch(device) {
            case 1: SmartDevice light = new SmartLight();
                    light.turnOn();
                    light.getStatus();
                    light.turnOff();
                    light.getStatus();
                    break;
            case 2: SmartDevice fan = new SmartFan(2);
                    fan.turnOn();
                    fan.getStatus();
                    fan.turnOff();
                    fan.getStatus();
                    break;
            case 3: SmartDevice ac = new SmartAC();
                    ac.turnOn();
                    ac.getStatus();
                    ac.turnOff();
                    ac.getStatus();
                    break;
            default:
                System.out.println("Invalid device selected. Please select a valid device.");
        }
    }
}
