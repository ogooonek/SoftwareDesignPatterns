package task5;

public class StandardFactory extends Factory {
    @Override
    public Taxi createTaxi(String driverName, String license) {
        Driver driver = createDriver(driverName);
        return new StandardTaxi(driver, license);
    }

    @Override
    public Driver createDriver(String driverName) {
        return new StandardDriver(driverName);
    }
}
