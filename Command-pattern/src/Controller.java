public class Controller {
    Command [] slots;

    public Controller(){
        slots = new Command[3];

        Command noCommand = new NoCommand();
        for(int i = 0; i < 3; i++){
            slots[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command command){
        slots[slot] = command;
    }

    public void Pressed(int slot, int line, String absolutePath){
        slots[slot].execute(line, absolutePath);
    }


}
