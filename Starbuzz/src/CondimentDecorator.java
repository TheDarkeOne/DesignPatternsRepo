public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();

    public Size getsize(){
        return beverage.getSize();
    }
}
