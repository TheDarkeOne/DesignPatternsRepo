public class ChicagoStylePepperoniPizza extends Pizza{
    public ChicagoStylePepperoniPizza(){
        name = "Chicago Style Pepperoni Pizza";
        dough = "Thick crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Grated Mozzarella Cheese");
        toppings.add("Parmesan Cheese");
        toppings.add("Eggplant");
        toppings.add("Black Olives");
        toppings.add("Spinach");
        toppings.add("Pepperoni");
    }

    @Override
    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
