package theory.practice2.creational.fabricmethod.after;

class Ship extends Transport {
    @Override
    void deliver() {
        System.out.println("Deliver by sea in a container.");
    }
}
