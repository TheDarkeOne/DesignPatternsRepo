public class calculator {
    int sum, diff;
    double prod, quot;
    public int add(double num1, double num2){

        int sum = (int) (Math.round(num1) + Math.round(num2));

        return sum;
    }

    public int subtract(double num1, double num2){
        int diff = (int) (Math.round(num1) - Math.round(num2));

        return diff;
    }

    public double multiply(double num1, double num2){
        double prod;

        prod = num1 * num2;

        return prod;
    }

    public double divide(double num1, double num2){
        double quot;

        if(num2 != 0) {
            quot = num1 / num2;
        }else{
            System.out.println("You entered 0 for your second number, that is an invalid divisor");
            quot = 0;
        }

        return quot;
    }
}
