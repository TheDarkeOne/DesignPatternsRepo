import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calc calc = new Calc();
        getInput(calc);
    }

    public static void getInput(Calc calculator){
        Calc calc = calculator;
        char temp = 0;
        String line;
        Scanner read = new Scanner(System.in);
        System.out.print("Enter an expression: ");
        line = read.nextLine();
        for(int i = 0; i < line.length(); i++) {
            temp = line.charAt(i);
            calc.addChar(temp);
        }
    }
}
