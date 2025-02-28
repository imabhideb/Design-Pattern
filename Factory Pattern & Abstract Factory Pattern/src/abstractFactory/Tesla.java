package abstractFactory;

import factory.Vehicle;

public class Tesla implements Vehicle{

    @Override
    public void drive() {
        System.out.println("Driving a Tesla..!!");
    }
    
}
