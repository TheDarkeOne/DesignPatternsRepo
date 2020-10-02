public class Calc {
    State zeroState;
    State zeroTwoState;
    State numState;
    State numTwoState;
    State equalsState;
    State decimalState;

    State state, prevState;
    char oper;
    double Number1, Number2;
    Calc(){
        Number1 = 0;
        Number2 = 0;
        zeroState = new ZeroState(this);
        zeroTwoState = new ZeroTwoState(this);
        numState = new GetNumState(this);
        numTwoState = new GetNumTwoState(this);
        equalsState = new EqualsState(this);
        decimalState = new DecimalState(this);
        state = zeroState;
        prevState = zeroState;
    }

    public void addChar(char value){
        state.addChar(value);
        state.operate();
    }

    public void setState(State state){
        this.state = state;
    }

    public State getEqualsState() {
        return equalsState;
    }

    public State getNumState() {
        return numState;
    }

    public State getNumTwoState() {
        return numTwoState;
    }

    public State getDecimalState() {
        return decimalState;
    }

    public State getZeroState() {
        return zeroState;
    }

    public State getZeroTwoState() {
        return zeroTwoState;
    }
}
