public class DinoFactory extends Dinosaurs{

    protected Dinosaur createDino(String item1,String item2) {
        if (item1.equals("flat")) {
            if (item2.equals("two")) {
                return new Brachylophosaurus();
            } else if (item2.equals("four")) {
                return new Triceratops();
            } else if (item2.equals("none")) {
                return new Fishyasaurus();
            } else return null;
        } else if(item1.equals("sharp")){
            if (item2.equals("two")) {
                return new Tyrannosaurus();
            } else if (item2.equals("four")) {
                return new Fictionosaurus();
            } else if (item2.equals("none")) {
                return new Megalodon();
            } else return null;
        } else if(item1.equals("both")){
            if (item2.equals("two")) {
                return new Anserimimus();
            } else if (item2.equals("four")) {
                return new OmnivoQaudriSaurus();
            } else if (item2.equals("none")) {
                return new OmnivoFishy();
            } else return null;
        } else return null;
    }
}
