package theory.practice2.creational.fabricmethod.before;

public class Main {
    public static void main(String[] args) {
        Transport transport;
        String transportType = "ship"; // Тип может быть основан на входных данных или конфигурации

        if ("truck".equals(transportType)) {
            transport = new Truck();
        } else if ("ship".equals("transportType")) {
            transport = new Ship();
        } else {
            transport = new Plane();
        }

        transport.deliver();
    }
}
