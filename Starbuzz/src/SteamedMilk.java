public class SteamedMilk extends CondimentDecorator {
    public SteamedMilk(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Steamed Milk";
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
