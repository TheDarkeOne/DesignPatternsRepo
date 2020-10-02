import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Controller control = new Controller();
        addAlpha addA = new addAlpha();
        addNumeric addN = new addNumeric();
        removeLine rLine = new removeLine();

        control.setCommand(0,addA);
        control.setCommand(1,addN);
        control.setCommand(2,rLine);

        String directory = System.getProperty("user.home");
        String fileName = "test123.txt";
        String absolutePath = directory + File.separator + fileName;

        control.Pressed(0,-1,absolutePath);
        control.Pressed(1, -1, absolutePath);
        control.Pressed(2, 2, absolutePath);
    }
}
