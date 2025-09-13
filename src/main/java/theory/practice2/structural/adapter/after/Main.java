package theory.practice2.structural.adapter.after;

public class Main {
    public static void main(String[] args) {
        FahrenheitThermometer fThermometer = new FahrenheitThermometer();
        WeatherApp app = new WeatherApp();

        CelsuisAdapter celsuisAdapter = new CelsuisAdapter(fThermometer);

        app.printTemperature(celsuisAdapter.getCelsuis()); // Неудобно и повторяющееся преобразование
    }
}
