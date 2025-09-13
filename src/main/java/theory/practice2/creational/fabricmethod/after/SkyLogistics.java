package theory.practice2.creational.fabricmethod.after;

public class SkyLogistics extends Logistics {
    @Override
    Transport createTransport() {
        return new Plane();
    }
}
