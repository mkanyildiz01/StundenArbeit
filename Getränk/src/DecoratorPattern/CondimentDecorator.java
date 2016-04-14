package DecoratorPattern;

public abstract class CondimentDecorator extends Beverage{
    private String description;

    public abstract String getDescription();
}
