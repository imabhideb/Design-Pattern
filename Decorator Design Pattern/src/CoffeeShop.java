import components.Coffee;
import components.SimpleCoffee;
import decorators.Milk;
import decorators.Sugar;

public class CoffeeShop {
    public static void main(String[] args){

        Coffee coffee1 = new SimpleCoffee();    // Here you call the base

        System.out.println(coffee1.getDescription() + " -> $" + coffee1.cost());
        
        // Below are the decorators applied at run time
        coffee1 = new Milk(coffee1);
        System.out.println(coffee1.getDescription() + " -> $" + coffee1.cost());
        
        coffee1 = new Sugar(coffee1);
        System.out.println(coffee1.getDescription() + " -> $" + coffee1.cost());


        // Since everything is wrapped around above but you can still call the base class again without wrapper or may be add seperate wrapper
        Coffee coffee2 = new SimpleCoffee();
        System.out.println(coffee2.getDescription() + " -> $" + coffee2.cost());

    }
}
