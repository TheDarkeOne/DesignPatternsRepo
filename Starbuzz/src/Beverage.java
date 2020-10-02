public abstract class Beverage {
    public enum Size{Tall, Grande, Venti};
    Size size = Size.Grande;
    String Description = "Unknown Beverage";


    public String getDescription(){
        return Description;
    }

    public void setSize(Size size){
        this.size = size;
    }

    public Size getSize(){
        return this.size;
    }

    public abstract double cost();


}

