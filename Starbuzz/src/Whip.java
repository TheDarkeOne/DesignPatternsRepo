public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Whip";
    }

    public double cost(){
        double cost = beverage.cost();
        if(beverage.getSize() == Size.Tall)
            cost += .05;
        if(beverage.getSize() == Size.Grande)
            cost += .10;
        if(beverage.getSize() == Size.Venti)
            cost += .20;
        return cost;
    }
}
