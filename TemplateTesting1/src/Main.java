public class Main {

    public static void main(String[] args) {
        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\nMaking Tea...");
        teaHook.prepareRecipe();

        System.out.println("\nMaking Coffee");
        coffeeHook.prepareRecipe();
    }
}
