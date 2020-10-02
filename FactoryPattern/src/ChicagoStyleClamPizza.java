public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza(){
        name = "Chicago Style Clam Pizza";
        dough = "Thick crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Grated Mozzarella Cheese");
        toppings.add("Parmesan Cheese");
        toppings.add("Frozen Clams");
    }

    @Override
    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
