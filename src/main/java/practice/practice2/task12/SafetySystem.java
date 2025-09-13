package practice.practice2.task12;

public class SafetySystem implements HubHomeDevices {
    @Override
    public void turnOn() {
        System.out.println("SafetySystem turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("SafetySystem turned off");
    }
}
