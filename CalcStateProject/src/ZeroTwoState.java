public class ZeroTwoState implements State{
    Calc calc;

    ZeroTwoState(Calc calc){
        this.calc = calc;
    }

    public void addChar(char value){
        if(value == '0'){

        }else if(value == '1' || value == '2' || value == '3'
                || value == '4' || value == '5' || value == '6' || value == '7' || value == '8' || value == '9'){
            calc.Number2 = Character.getNumericValue(value);
            calc.setState(calc.getNumTwoState());
            calc.prevState = calc.getZeroTwoState();
        } else if(value == '.'){
            calc.setState(calc.getDecimalState());
            calc.prevState = calc.getNumTwoState();
        }
    }
    public void operate(){
    }

    public void clear() {

    }
}
