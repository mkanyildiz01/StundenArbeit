package DecoratorPattern;

public class Soy extends CondimentDecorator{

    private Beverage beverage;
    private String description;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    public double cost(){
        return .70 + beverage.cost();
    }
    public String getDescription() {
        return description;
    }

}
