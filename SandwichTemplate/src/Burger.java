import java.util.ArrayList;

public class Burger extends Sandwich{
    String answer = "no";
    public Burger(){

    }

    public Burger(String bread, String meat, String cheese, ArrayList<String> toppings, ArrayList<String> condiments,boolean meltedCheese, boolean stay){
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        if(meltedCheese){
            customerWantsHotCheese();
        }
        this.stay = stay;
        this.toppings = new ArrayList<>(toppings);
        this.condiments = new ArrayList<>(condiments);
    }
    public void cook(){
        System.out.println("Grilled " + meat + " for 10 minutes. ");

        System.out.println("Toast Buns for 2 minutes. ");

        if(hotCheese){
        System.out.println("Melted cheese during the last minute");
        }
    }

    public void addToppings(ArrayList<String> toppings){
        this.toppings = toppings;

        for (int x=0; x<this.toppings.size(); x++) {
            System.out.println("Adding " + this.toppings.get(x) + " to the burger");
        }

    }

    public void addCondiments(ArrayList<String> condiments){
        this.condiments = condiments;

        for (int x=0; x<this.condiments.size(); x++) {
            System.out.println("Adding " + this.condiments.get(x) + " to the burger");
        }

    }

    public void customerWantsHotCheese(){
        hotCheese = true;
        }

}
