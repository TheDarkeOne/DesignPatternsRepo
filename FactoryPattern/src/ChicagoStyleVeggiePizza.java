public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza(){
        name = "Chicago Style Veggie Pizza";
        dough = "Thick crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Grated Mozzarella Cheese");
        toppings.add("Parmesan Cheese");
        toppings.add("Eggplant");
        toppings.add("Black Olives");
        toppings.add("Spinach");
    }

    @Override
    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
