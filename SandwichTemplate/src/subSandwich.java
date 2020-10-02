import java.util.ArrayList;

public class subSandwich extends Sandwich{

    public subSandwich(){

    }

    public subSandwich(String bread, String meat, String cheese, ArrayList<String> toppings, ArrayList<String> condiments, boolean stay){
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.stay = stay;
        this.toppings = new ArrayList<>(toppings);
        this.condiments = new ArrayList<>(condiments);
    }

    public void cook(){
        System.out.println("Toasting bread for 2 minutes");
    }

    public void addToppings(ArrayList<String> toppings){
        this.toppings = toppings;

        for (int x=0; x<this.toppings.size(); x++) {
            System.out.println("Adding " + this.toppings.get(x) + " to the Sub");
        }

    }

    public void addCondiments(ArrayList<String> condiments){
        this.condiments = condiments;

        for (int x=0; x<this.condiments.size(); x++) {
            System.out.println("Adding " + this.condiments.get(x) + " to the Sub");
        }

    }
}
