public class GetNumState implements State{
    Calc calc;

    GetNumState(Calc calc){
        this.calc = calc;
    }
    public void addChar(char value){
        if(value == '0' || value == '1' || value == '2' || value == '3'
                || value == '4' || value == '5' || value == '6' || value == '7' || value == '8' || value == '9'){
        double tempNum = Character.getNumericValue(value);
            calc.Number1 = (calc.Number1*10) + tempNum;
        } else if( value == '.'){
            calc.setState(calc.getDecimalState());
            calc.prevState = calc.getNumState();
        }
        else if(value == '*' || value == '/' || value == '+' || value == '-'){
            calc.oper = value;
            calc.setState(calc.getZeroTwoState());
            calc.prevState = calc.getNumState();
        } else if(value == '='){
            calc.Number2 = 0;
            calc.setState(calc.getEqualsState());
            calc.prevState = calc.getNumState();
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
