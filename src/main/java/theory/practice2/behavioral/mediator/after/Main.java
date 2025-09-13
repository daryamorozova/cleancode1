package theory.practice2.behavioral.mediator.after;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Alarm alarm = new Alarm();
        Thermostat thermostat = new Thermostat();

        HomeMediator homeMediator = new HomeMediator(light, alarm, thermostat);

        homeMediator.notify(thermostat, "morning");
    }
}
