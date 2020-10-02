public abstract class Dinosaurs {
    public Dinosaur makeDinosaur(String criteria1, String criteria2){
        Dinosaur dino;

        dino = createDino(criteria1, criteria2);

        dino.prepare();
        dino.grow();
        dino.remove();
        dino.box();
        dino.ship();

        return dino;
    }

    protected abstract Dinosaur createDino(String type1, String type2);
}
