package abstractFactory;

public class FactoryProducer {
    public static VehicleFactory getFactory(String type) {
        if(type.equalsIgnoreCase("electric")){
            return new ElectricFactory();
        }
        else if (type.equalsIgnoreCase("petrol")){
            return new PetrolVehicleFactory();
        }
        else{
            return null;
        }
    }
}
