import java.util.Iterator;

public class NullIterator implements Iterator<MenuComponent>{
    public MenuComponent next(){
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
