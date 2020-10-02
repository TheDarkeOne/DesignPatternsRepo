public class DecimalState implements State{
    Calc calc;
    int n = 0;
    DecimalState(Calc calc){
        this.calc = calc;
    }
    public void addChar(char value){
        if(value == '0' || value == '1' || value == '2' || value == '3'
                || value == '4' || value == '5' || value == '6' || value == '7' || value == '8' || value == '9'){
            n++;
            double tempNum = Character.getNumericValue(value);

            if(calc.prevState == calc.getNumState()) {
                calc.Number1 = (calc.Number1) + (tempNum/(10^n));
            } else if(calc.prevState == calc.getNumTwoState()){
                calc.Number2 = (calc.Number2) + tempNum/(10^n);
            }
        }
        else if(value == '*' || value == '/' || value == '+' || value == '-'){
            calc.oper = value;
            if(calc.prevState == calc.getNumState()){
                calc.setState(calc.getZeroTwoState());
                calc.prevState = calc.getDecimalState();
            }
            n = 0;
        } else if(value == '='){
            calc.setState(calc.getEqualsState());
            calc.prevState = calc.getDecimalState();
        }
    }
    public void operate(){
    }

    public void clear() {
        calc.Number1 = 0;
        calc.Number2 = 0;

        calc.setState(calc.getZeroState());
        calc.prevState = calc.getZeroState();
    }
}
