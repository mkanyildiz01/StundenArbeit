package DecoratorPattern;

public class Mocha extends CondimentDecorator{
    private Beverage beverage;
    private String description;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    public double cost(){
        return .60 + beverage.cost();
    }
    public String getDescription() {
        return description;
    }

}
