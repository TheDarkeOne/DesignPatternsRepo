public class EqualsState implements State{
    Calc calc;

    EqualsState(Calc calc){
        this.calc = calc;
    }
    public void addChar(char value){
        if(value == '='){
            operate();
        }
    }
    public void operate(){
        if(calc.oper == '+'){
        calc.Number1 += calc.Number2;
        } else if(calc.oper == '-'){
            calc.Number1 = calc.Number1 - calc.Number2;
        } else if(calc. oper == '*'){
            calc.Number1 = calc.Number1 * calc.Number2;
        } else if(calc.oper == '/'){
            if(calc.Number2 == 0){
                calc.Number2 = 1;
            }
            calc.Number1 = calc.Number1 / calc.Number2;
        }
        System.out.println("The Result is " + calc.Number1);
    }

    public void clear() {
        calc.Number1 = 0;
        calc.Number2 = 0;

        calc.setState(calc.getZeroState());
    }
}
