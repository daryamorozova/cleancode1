package theory.practice2.structural.adapter.after;

// Наш системный класс ожидает температуру в градусах Цельсия
class WeatherApp {
    public void printTemperature(double temperature) {
        System.out.println("Temperature is: " + temperature + "°C");
    }
}
