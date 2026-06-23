package OOPS.oops.oops_fundamental_programming;

public class ChargingStation {

    static int totalStations = 0;
    static double electricityRate = 8.0;

    int stationId;
    double unitsConsumed;

    public ChargingStation(int stationId, double unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    void displayStationDetails() {
        System.out.println("Station ID: " + stationId);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Bill: " + calculateBill());
        System.out.println();
    }

    public static void main(String[] args) {

        ChargingStation s1 = new ChargingStation(101, 100);
        ChargingStation s2 = new ChargingStation(102, 120);
        ChargingStation s3 = new ChargingStation(103, 150);
        ChargingStation s4 = new ChargingStation(104, 180);
        ChargingStation s5 = new ChargingStation(105, 200);

        electricityRate = 10.0;

        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        System.out.println("Total Stations: " + totalStations);
    }
}