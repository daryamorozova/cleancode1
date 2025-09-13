package practice.practice2.task10;

/**
 * Адаптер для конвертации миль в километры
 * Описание
 * В проекте есть система, которая работает с мильными единицами (например, старая система),
 * но новая система должна использовать километры. Нужно создать адаптер, который будет
 * преобразовывать мили в километры, чтобы новая система могла работать с ними, не изменяя её логику.
 */

public class Main {
    public static void main(String[] args) {
        MilesPerHour milesPerHour = new MilesPerHour();
        Speedometr speedometr = new Speedometr();

        KmPerHourAdapter adapter = new KmPerHourAdapter(milesPerHour);

        speedometr.printSpeed(adapter.getKmPerHour());
    }

}
