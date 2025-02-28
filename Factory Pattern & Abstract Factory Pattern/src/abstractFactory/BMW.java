package abstractFactory;

import factory.Vehicle;

public class BMW implements Vehicle{

    @Override
    public void drive() {
        System.out.println("Driving a Beemer..!!!");
    }
    
}
