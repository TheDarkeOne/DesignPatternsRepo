import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Sandwich burger = new Burger();
        Sandwich sub = new subSandwich();
        String bread;
        String meat;
        String cheese;
        StringBuilder order = new StringBuilder("You ordered a ");
        Boolean add = true, add2 = true,mayo1 = false, ketchup = false,
                mustard1 = false, mayo2 = false, mustard2 = false, meltedCheese = false, stay = null;
        String choice, answer, answer2;
        int bread1, meat1, cheese1;
        int choices, choices2, choices3, choices4;
        Scanner in = new Scanner(System.in);
        ArrayList<String> toppings = new ArrayList<>();
        ArrayList<String> condiments = new ArrayList<>();

            System.out.println("Do you want a burger or a sub sandwich (burger/sub)? ");
            choice = in.next();

            switch(choice.toLowerCase()) {
                case "burger":
                    order.append("Burger with ");
                    bread = "Burger bun";
                    meat = "Burger patty";
                    cheese = "Cheddar";

                    do {
                        System.out.println("What do you want to add to your burger? 1. Lettuce 2. Tomato " +
                                "3. Pickles 4. Onions 5. Bacon 6. Finish");
                            choices = in.nextInt();

                        switch(choices) {
                            case 1: order.append("lettuce, ");
                                toppings.add("lettuce");
                            break;
                            case 2: order.append("tomato, ");
                                toppings.add("tomato");
                            break;
                            case 3: order.append("pickles, ");
                            toppings.add("pickles");
                                break;
                            case 4: order.append("onions, ");
                                toppings.add("onions");
                                break;
                            case 5: order.append("bacon, ");
                                toppings.add("bacon");
                                break;
                            case 6: if(order.toString().equals("You ordered a burger with ")) {
                                order.append("no toppings");
                                }
                                add = false;
                                break;
                                default:
                                    break;
                        }
                    }while(add);

                    do{
                        System.out.println("what condiment do you want? 1. Mayonnaise 2. Ketchup 3. Mustard 4. Finish");
                        choices2 = in.nextInt();
                        switch(choices2) {
                            case 1:
                                if(!mayo1) {
                                    order.append("and mayonnaise ");
                                    condiments.add("Mayonnaise");
                                    mayo1 = true;
                                }
                                break;
                            case 2:
                                if(!ketchup) {
                                    order.append("and ketchup ");
                                    condiments.add("Ketchup");
                                    ketchup = true;
                                }
                                break;
                            case 3:
                                if(!mustard1) {
                                    order.append("and mustard ");
                                    condiments.add("Mustard");
                                    mustard1 = true;
                                }
                                break;
                            case 4: add2 = false;
                                break;
                            default:
                                break;
                        }
                    }while(add2);

                    System.out.println("Do you want melted cheese (yes/no)? ");
                    answer = in.next();

                    switch(answer.toLowerCase()){
                        case "yes":
                            meltedCheese = true;
                            order.append(", with melted cheese. ");
                            break;
                        case "no":
                            meltedCheese = false;
                            break;
                    }

                    System.out.println("Do you want to stay or to go (stay/go)? ");
                    answer2 = in.next();

                    switch(answer2.toLowerCase()){
                        case "stay":
                            stay = true;
                            break;
                        case "go":
                            stay = false;
                            break;
                    }

                    System.out.println(order);

                    System.out.println("The cook is doing this to make your order ");
                    burger.prepareRecipe(bread, meat, cheese,toppings, condiments,meltedCheese,stay);

                    break;
                case "sub":
                    order.append("Sub sandwich with ");

                    System.out.println("What type of bread do you want? 1. Ciabatta 2. Whole wheat 3. Sourdough 4. Rye");
                    bread1 = in.nextInt();

                    switch(bread1){
                        case 1:
                            bread = "Ciabatta";
                            break;
                        case 2:
                            bread = "Whole Wheat";
                            break;
                        case 3:
                            bread = "Sourdough";
                            break;
                        case 4:
                            bread = "Rye";
                            break;
                        default:
                            bread = "Whole Wheat";
                            break;
                    }

                    System.out.println("What type of meat do you want? 1. Roast beef 2. Turkey 3. Ham 4. Chicken");
                    meat1 = in.nextInt();

                    switch(meat1){
                        case 1:
                            meat = "Roast beef";
                            break;
                        case 2:
                            meat = "Turkey";
                            break;
                        case 3:
                            meat = "Ham";
                            break;
                        case 4:
                            meat = "Chicken";
                            break;
                        default:
                            meat = "Turkey";
                            break;
                    }

                    System.out.println("What type of cheese do you want? 1. Cheddar 2. Swiss 3. Mozzarella 4. Pepper Jack");
                    cheese1 = in.nextInt();

                    switch(cheese1){
                        case 1:
                            cheese = "Cheddar";
                            break;
                        case 2:
                            cheese = "Swiss";
                            break;
                        case 3:
                            cheese = "Mozzarella";
                            break;
                        case 4:
                            cheese = "Pepper Jack";
                            break;
                        default:
                            cheese = "Cheddar";
                            break;
                    }

                    do {
                        System.out.println("What do you want to add to your burger? 1. Lettuce 2. Tomato " +
                                "3. Pickles 4. Onions 5. Bacon 6. Finish");
                        choices3 = in.nextInt();

                        switch(choices3) {
                            case 1: order.append("lettuce, ");
                                toppings.add("lettuce");
                                break;
                            case 2: order.append("tomato, ");
                                toppings.add("tomato");
                                break;
                            case 3: order.append("pickles, ");
                                toppings.add("pickles");
                                break;
                            case 4: order.append("onions, ");
                                toppings.add("onions");
                                break;
                            case 5: order.append("bacon, ");
                                toppings.add("bacon");
                                break;
                            case 6: if(order.toString().equals("You ordered a Sub sandwich with ")) {
                                order.append("no toppings");
                            }
                                add = false;
                                break;
                            default:
                                break;
                        }
                    }while(add);

                    do{
                        System.out.println("what condiment do you want? 1. Mayonnaise 2. Mustard 3. Finish");
                        choices4 = in.nextInt();
                        switch(choices4) {
                            case 1:
                                if(!mayo2) {
                                    order.append("and mayonnaise ");
                                    condiments.add("Mayonnaise");
                                    mayo2 = true;
                                }
                                break;
                            case 2:
                                if(!mustard2) {
                                    order.append("and mustard ");
                                    condiments.add("Mustard");
                                    mustard2 = true;
                                }
                                break;
                            case 3: add2 = false;
                                break;
                            default:
                                break;
                        }
                    }while(add2);

                    System.out.println("Do you want to stay or to go (stay/go)? ");
                    answer2 = in.next();

                    switch(answer2.toLowerCase()){
                        case "stay":
                            stay = true;
                            break;
                        case "go":
                            stay = false;
                            break;
                    }


                    System.out.println(order);

                    System.out.println("The cook is doing this to make your order ");
                    sub.prepareRecipe(bread, meat, cheese,toppings, condiments,false,stay);
                    break;
            }
    }
}
