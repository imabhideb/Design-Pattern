package decorators;

import components.Coffee;

public class Milk extends CoffeeDecorator{
    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription(){
        return coffee.getDescription() + ", with Milk";
    }

    @Override
    public double cost(){
        return coffee.cost() + 1.5;
    }
}
