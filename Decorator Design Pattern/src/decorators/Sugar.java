package decorators;

import components.Coffee;

public class Sugar extends CoffeeDecorator{

    public Sugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription(){
        return coffee.getDescription() + ", and added Sugar";
    }

    @Override
    public double cost(){
        return coffee.cost() + 0.5;
    }
    
}
