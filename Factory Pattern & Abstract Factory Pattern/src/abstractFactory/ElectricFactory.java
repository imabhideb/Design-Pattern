package abstractFactory;

import factory.Vehicle;

public class ElectricFactory implements VehicleFactory{

    public Vehicle createVehicle() {
        return new Tesla();
    }
    
}
