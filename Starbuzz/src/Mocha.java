public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Mocha";
    }

    public double cost(){
        double cost = beverage.cost();
        if(beverage.getSize() == Size.Tall)
            cost += .20;
        if(beverage.getSize() == Size.Grande)
            cost += .30;
        if(beverage.getSize() == Size.Venti)
            cost += .40;
        return cost;
    }
}
