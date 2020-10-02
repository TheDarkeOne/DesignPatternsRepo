import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Dinosaurs DinoOne = new DinoFactory();
        String choice1,choice2;
        Scanner input = new Scanner(System.in);

        System.out.println("What type of teeth does the dinosaur have? flat, sharp, or both? ");
        choice1 = input.nextLine();

        System.out.println("How many legs does the dinosaur have? four, two, or none? ");
        choice2 = input.nextLine();


        Dinosaur Dino = DinoOne.makeDinosaur(choice1.toLowerCase(), choice2.toLowerCase());
        System.out.println("You ordered a " + Dino.getName() + "\n");

    }
}
