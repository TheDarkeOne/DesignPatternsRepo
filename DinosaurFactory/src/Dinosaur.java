public abstract class Dinosaur {
    String name;
    String legs;




    void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Finding Gene");
        System.out.println("Growing " + legs + " legged " + name);
        System.out.println("Hatching " + name + " Egg");
    }

    void grow(){ System.out.println("Grow for 20 days in right environment"); }

    void remove(){ System.out.println("Removing Dino from herd"); }

    void box(){ System.out.println("Boxing in secure container."); }

    void ship(){ System.out.println("Shipping to destination"); }

    public  String getName(){
        return name;
    }
}
