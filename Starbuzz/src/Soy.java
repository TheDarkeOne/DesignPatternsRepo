public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Soy";
    }

    public double cost(){
        double cost = beverage.cost();
        if(beverage.getSize() == Size.Tall)
            cost += .10;
        if(beverage.getSize() == Size.Grande)
            cost += .15;
        if(beverage.getSize() == Size.Venti)
            cost += .20;
        return cost;
    }
}
