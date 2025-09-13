package theory.practice2.structural.adapter.after;


public class CelsuisAdapter {
    private FahrenheitThermometer fahrenheitThermometer;

    public CelsuisAdapter(FahrenheitThermometer fahrenheitThermometer) {
        this.fahrenheitThermometer = fahrenheitThermometer;
    }

    public double getCelsuis() {
        double fTemp = fahrenheitThermometer.getFahrenheitTemperature();
        double cTemp = (fTemp - 32) * 5.0 / 9.0; // Преобразование в Цельсий
        return cTemp;
    }
}
