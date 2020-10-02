import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void Sub(){
        String bread = "Whole wheat", meat = "Turkey", cheese = "Cheddar";
        ArrayList<String> toppings = new ArrayList<>(Arrays.asList(new String[] {"Lettuce","Tomato","Pickle","Onions"}));
        ArrayList<String> condiments =  new ArrayList<>(Arrays.asList(new String[] {"Mayonnaise","Mustard"}));
        boolean stay = true;

        Sandwich sub1 = new subSandwich(bread, meat, cheese, toppings, condiments, stay);
        Sandwich sub2 = new subSandwich();

        sub2.prepareRecipe(bread, meat, cheese, toppings, condiments, false, stay);

        assertEquals(sub1.meat,sub2.meat);
        assertEquals(sub1.bread, sub2.bread);
        assertEquals(sub1.cheese,sub2.cheese);
        assertEquals(sub1.toppings, sub2.toppings);
        assertEquals(sub1.condiments,sub2.condiments);

    }

    @Test
    public void burger(){
        String bread = "Whole wheat", meat = "Turkey", cheese = "Cheddar";
        ArrayList<String> toppings = new ArrayList<>(Arrays.asList(new String[] {"Lettuce","Tomato","Pickle","Onions"}));
        ArrayList<String> condiments =  new ArrayList<>(Arrays.asList(new String[] {"Mayonnaise","Mustard"}));
        boolean meltedCheese = false, stay = true;

        Sandwich burger1 = new Burger(bread, meat, cheese, toppings, condiments, meltedCheese, stay);
        Sandwich burger2 = new Burger();

        burger2.prepareRecipe(bread, meat, cheese, toppings, condiments, meltedCheese, stay);

        assertEquals(burger1.meat,burger2.meat);
        assertEquals(burger1.bread, burger2.bread);
        assertEquals(burger1.cheese,burger2.cheese);
        assertEquals(burger1.toppings, burger2.toppings);
        assertEquals(burger1.condiments,burger2.condiments);
        assertEquals(burger1.hotCheese,burger2.hotCheese);

    }

    @Test
    public void testHook(){
        Sandwich burger = new Burger();

        String bread = "Whole wheat", meat = "Turkey", cheese = "Cheddar";
        ArrayList<String> toppings = new ArrayList<>(Arrays.asList(new String[] {"Lettuce","Tomato","Pickle","Onions"}));
        ArrayList<String> condiments =  new ArrayList<>(Arrays.asList(new String[] {"Mayonnaise","Mustard"}));
        boolean meltedCheese = true, stay = true;

        burger.prepareRecipe(bread,meat,cheese,toppings,condiments,meltedCheese,stay);

        assertEquals(true, burger.hotCheese);
    }

    @Test
    public void testHookSub(){
        Sandwich sub = new subSandwich();

        String bread = "Whole wheat", meat = "Turkey", cheese = "Cheddar";
        ArrayList<String> toppings = new ArrayList<>(Arrays.asList(new String[] {"Lettuce","Tomato","Pickle","Onions"}));
        ArrayList<String> condiments =  new ArrayList<>(Arrays.asList(new String[] {"Mayonnaise","Mustard"}));
        boolean meltedCheese = true, stay = true;

        sub.prepareRecipe(bread,meat,cheese,toppings,condiments,meltedCheese,stay);

        assertEquals(false, sub.hotCheese);
    }

    @Test
    public void testStay(){
        Sandwich burger = new Burger();

        String bread = "Whole wheat", meat = "Turkey", cheese = "Cheddar";
        ArrayList<String> toppings = new ArrayList<>(Arrays.asList(new String[] {"Lettuce","Tomato","Pickle","Onions"}));
        ArrayList<String> condiments =  new ArrayList<>(Arrays.asList(new String[] {"Mayonnaise","Mustard"}));
        boolean meltedCheese = true, stay = false;

        burger.prepareRecipe(bread,meat,cheese,toppings,condiments,meltedCheese,stay);

        assertEquals(false, burger.stay);
    }
}