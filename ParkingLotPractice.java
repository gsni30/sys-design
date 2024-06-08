// Parking lot practice

public class ParkingLotPractice {
    
}

// Parking Lot

class ParkingLot {
    private List<ParkingFloor> parkingFloors;
    private String address;

    public void addParkingFloor();
    public List<ParkingFloor> getParkingFloors();

}

class Vehicle {
    private String licenseNumber;
    VehicleType vehicleType;

}

class ParkingFloor {
    private List<ParkingSpot> parkingSpots;
    private int floorNumber;

    public void addParkingSport(ParkingSpotType parkingSpotType);
    public List<ParkingSpot> getParkingSpots();
}

abstract class ParkingSpot {
    private String spotId;
    private Vehicle assignedVehicle;

    public void assignVehicle(Vehicle vehicle);
    public void removeVehicle(Vehicle vehicle);
}

class LargeParkingSpot extends ParkingSpot {

}

class SmallParkingSpot extends ParkingSpot {

}

class ElectricVehicleParkingSpot extends ParkingSpot {

}

class HandicappedParkingSpot extends ParkingSpot {

}

abstract class Vehicle {

}

class LargeVehicle extends Vehicle {

}

class SmallVehicle extends Vehicle {

}

class ElectricVehicle extends Vehicle {

}