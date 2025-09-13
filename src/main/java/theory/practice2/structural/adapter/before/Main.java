package theory.practice2.structural.adapter.before;

public class Main {
    public static void main(String[] args) {
        FahrenheitThermometer fThermometer = new FahrenheitThermometer();
        WeatherApp app = new WeatherApp();

        // Проблема: FahrenheitThermometer возвращает значение в Фаренгейтах
        double fTemp = fThermometer.getFahrenheitTemperature();
        double cTemp = (fTemp - 32) * 5.0 / 9.0; // Преобразование в Цельсий

        app.printTemperature(cTemp); // Неудобно и повторяющееся преобразование
    }
}
