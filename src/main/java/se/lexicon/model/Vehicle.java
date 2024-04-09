package se.lexicon.model;

public class Vehicle {
    private String licencePlate;
    private VehicleType type;


    public Vehicle(String licencePlate, VehicleType type) {
        this.licencePlate = licencePlate;
        this.type = type;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public VehicleType getType() {
        return type;
    }

    public void setLicencePlate(String licencePlate) {
        if (licencePlate == null) {throw new IllegalArgumentException("Licence plate should not be empty");}

        this.licencePlate = licencePlate;
    }
}




