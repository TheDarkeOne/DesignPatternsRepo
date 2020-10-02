import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public abstract class Sandwich {
    String bread = "bread", meat = "meat", cheese ="cheese";
    ArrayList<String> toppings;
    ArrayList<String> condiments;
    Boolean hotCheese = false, stay = false;


    final void prepareRecipe(String bread, String meat, String cheese,ArrayList<String> toppings, ArrayList<String> condiments, boolean meltedCheese, boolean stay){
        assembleBMC(bread, meat, cheese);
        if (meltedCheese) {
            customerWantsHotCheese();
        }
        cook();
        addToppings(toppings);
        addCondiments(condiments);
        bagTray(stay);
    }

    public void assembleBMC(String bread, String meat, String cheese){
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;

        System.out.println("Getting " + bread);
        System.out.println("Getting " + meat);
        System.out.println("Getting " + cheese);
    }

    public abstract void cook();

    public abstract void addToppings(ArrayList<String> toppings);

    public abstract void addCondiments(ArrayList<String> condiments);

    public void bagTray(boolean stay){
        this.stay = stay;

        if(this.stay){
            System.out.println("Putting food on a tray...");
        } else{
            System.out.println("Bagging food now...");
        }
    }

    void customerWantsHotCheese(){;}
}
