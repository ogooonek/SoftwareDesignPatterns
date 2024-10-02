package task5;

public class PremiumFactory extends Factory {
    @Override
    public Taxi createTaxi(String driverName, String license) {
        Driver driver = createDriver(driverName);
        return new PremiumTaxi(driver, license);
    }

    @Override
    public Driver createDriver(String driverName) {
        return new PremiumDriver(driverName);
    }
}
