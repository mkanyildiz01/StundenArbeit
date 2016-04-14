package DecoratorPattern;

public class Milk extends CondimentDecorator {
    private Beverage beverage;
    private String description;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    public double cost(){
        return .50 + beverage.cost();
    }
    public String getDescription() {
        return description + ", Milch";
    }

}
