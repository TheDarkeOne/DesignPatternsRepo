public class GetNumTwoState implements State{
    Calc calc;

    GetNumTwoState(Calc calc){
        this.calc = calc;
    }
    public void addChar(char value){
        if(value == '0' || value == '1' || value == '2' || value == '3'
                || value == '4' || value == '5' || value == '6' || value == '7' || value == '8' || value == '9'){

            calc.Number2 = (calc.Number2*10) + Character.getNumericValue(value);
        } else if( value == '.'){
            calc.setState(calc.getDecimalState());
            calc.prevState = calc.getNumTwoState();
        } else if(value == '='){
            calc.setState(calc.getEqualsState());
            calc.prevState = calc.getNumTwoState();
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