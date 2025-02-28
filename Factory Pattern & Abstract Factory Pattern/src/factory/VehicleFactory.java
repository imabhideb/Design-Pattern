package factory;

public class VehicleFactory {
    public static Vehicle getVehicle(String type) {
        if (type.equalsIgnoreCase("car")){
            return new Car();
        }
        else if (type.equalsIgnoreCase("bike")){
            return new Bike();
        }
        else{
            return null;
        }
    }
}
