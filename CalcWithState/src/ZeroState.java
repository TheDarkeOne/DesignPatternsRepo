public class ZeroState implements State{
    Calc calc;

    ZeroState(Calc calc){
        this.calc = calc;
    }

    public void addChar(char value){
        if(value == '0'){

        }else if(value == '1' || value == '2' || value == '3'
                || value == '4' || value == '5' || value == '6' || value == '7' || value == '8' || value == '9'){
            calc.Number1 = Character.getNumericValue(value);
            calc.setState(calc.getNumState());
            calc.prevState = calc.getZeroState();
        }else if(value == '.'){
            calc.setState(calc.getDecimalState());
            calc.prevState = calc.getNumState();
        }
    }
    public void operate(){
    }

    public void clear() {

    }
}
