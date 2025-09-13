package theory.practice2.creational.fabricmethod.after;

public class LandLogistics extends Logistics {
    @Override
    Transport createTransport() {
        return new Truck();
    }
}
