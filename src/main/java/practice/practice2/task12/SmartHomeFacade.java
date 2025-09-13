package practice.practice2.task12;

public class SmartHomeFacade {
    private Light light;
    private Conditioner conditioner;
    private SafetySystem safetySystem;

    public SmartHomeFacade() {
        this.light = new Light();
        this.conditioner = new Conditioner();
        this.safetySystem = new SafetySystem();
    }

    public void turnOnAllDevices(){
        light.turnOn();
        conditioner.turnOn();
        safetySystem.turnOn();
    }

    public void turnOffAllDevices(){
        light.turnOff();
        conditioner.turnOff();
        safetySystem.turnOff();
    }

}