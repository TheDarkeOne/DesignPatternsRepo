public class ChicagoPizzaStore extends PizzaStore{
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (item.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();
        } else if (item.equals("clam")) {
            pizza = new ChicagoStyleClamPizza();
        } else if (item.equals("veggie")) {
            pizza = new ChicagoStyleVeggiePizza();
        } else
            return null;
    return pizza;
    }
}
