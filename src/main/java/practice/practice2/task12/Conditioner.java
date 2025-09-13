package practice.practice2.task12;

public class Conditioner implements HubHomeDevices {
    @Override
    public void turnOn() {
        System.out.println("Conditioner turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Conditioner turned off");
    }
}
