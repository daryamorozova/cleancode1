package theory.practice2.behavioral.mediator.after;

class Thermostat {
    private Mediator mediator;
    public void setTemperature(int temperature) {
        System.out.println("Temperature set to " + temperature + "C");
    }
}
