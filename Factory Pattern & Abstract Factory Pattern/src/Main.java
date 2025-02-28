import abstractFactory.FactoryProducer;
import factory.Vehicle;
import factory.VehicleFactory;

public class Main {
    public static void main(String[] args){
        System.out.println("Factory Pattern");
        Vehicle car = VehicleFactory.getVehicle("Car");
        car.drive();
        
        Vehicle bike = VehicleFactory.getVehicle("Bike");
        bike.drive();

        System.out.println("\nAbstract Factory Pattern");
        abstractFactory.VehicleFactory eVehicleFactory = FactoryProducer.getFactory("electric");
        Vehicle eVehicle = eVehicleFactory.createVehicle();
        eVehicle.drive();

        abstractFactory.VehicleFactory pVehicleFactory = FactoryProducer.getFactory("petrol");
        Vehicle pVehicle = pVehicleFactory.createVehicle();
        pVehicle.drive();
    }
}
