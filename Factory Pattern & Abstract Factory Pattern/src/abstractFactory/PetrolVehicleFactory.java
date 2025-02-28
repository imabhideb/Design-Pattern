package abstractFactory;

import factory.Vehicle;

public class PetrolVehicleFactory implements VehicleFactory{

    public Vehicle createVehicle() {
        return new BMW();
    }
    
}
