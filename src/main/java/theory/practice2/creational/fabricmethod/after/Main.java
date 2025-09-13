package theory.practice2.creational.fabricmethod.after;

public class Main {
    public static void main(String[] args) {
        Logistics logistics;

        String transportType = "ship"; // Тип может быть основан на входных данных или конфигурации

        // код был открыт к расширению и закрыт к модификации
        if ("truck".equals(transportType)) {
            logistics = new LandLogistics(); // делегирован фабричному методу createTransport
        } else if ("ship".equals("transportType")) {
            logistics = new SeaLogistics(); // делегирован фабричному методу createTransport
        } else {
            logistics = new SkyLogistics(); // делегирован фабричному методу createTransport
        }

        logistics.planDeleivery();
    }
}
