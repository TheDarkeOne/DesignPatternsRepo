import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double num1, num2;
        int choice;
        boolean cont = true;

        while(cont == true){

            System.out.println();
            num1 = input.nextInt();

            System.out.println("Enter the second number(Integers above 0): ");
            num2 = input.nextInt();

            System.out.println();
            choice = input.nextInt();

            switch(choice){
                case 1:
                    //add
                    break;
                case 2:
                    //sub
                    break;
                case 3:
                    //multiply
                    break;
                case 4:
                    //divide
                    break;
                case 5:
                    //quit;
                    break;
                default:

                    break;
            }
        }
        }


}
