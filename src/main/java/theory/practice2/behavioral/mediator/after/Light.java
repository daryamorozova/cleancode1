package theory.practice2.behavioral.mediator.after;

class Light {
    private Mediator mediator;

    public void turnOn() {
        System.out.println("Light turned on");
    }

    public void turnOff() {
        System.out.println("Light turned off");
    }
}
