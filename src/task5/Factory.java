package task5;

public abstract class Factory {
    public abstract Taxi createTaxi(String driverName, String license);
    public abstract Driver createDriver(String driverName);
}
