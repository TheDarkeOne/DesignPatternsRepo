public class PumpkinSpice extends CondimentDecorator {
    public PumpkinSpice(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Pumpkin Spice";
    }

    public double cost(){
        double cost = beverage.cost();
        if(beverage.getSize() == Size.Tall)
            cost += .10;
        if(beverage.getSize() == Size.Grande)
            cost += .20;
        if(beverage.getSize() == Size.Venti)
            cost += .30;
        return cost;
    }
}
