package task1;

public class Main {
    public static void main(String[] args) {
        DriverManager driverManager = DriverManager.getInstance();
        String driver = driverManager.findNearestDriver("Location A");

        Passenger passenger = new Passenger();
        passenger.assignTaxi(driver);
    }
}
