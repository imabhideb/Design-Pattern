package components;

public class SimpleCoffee implements Coffee{

    @Override
    public String getDescription() {
        return "Here's your simple coffee";
    }

    @Override
    public double cost() {
        return 5.0;
    }
}
