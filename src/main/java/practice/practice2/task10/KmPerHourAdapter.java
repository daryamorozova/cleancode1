package practice.practice2.task10;

public class KmPerHourAdapter {
    private MilesPerHour milesPerHour;
    double COEFFICIENT = 1.60934;

    public KmPerHourAdapter(MilesPerHour milesPerHour) {
        this.milesPerHour = milesPerHour;
    }

    public double getKmPerHour() {
        double mSpeed = milesPerHour.getSpeedMilesPerHour();
        double kmSpeed = mSpeed * COEFFICIENT;
        return kmSpeed;
    }
}
