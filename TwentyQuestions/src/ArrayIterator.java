import java.util.ArrayList;

public class ArrayIterator implements ArIterator{
    int i = 0;
    ArrayList<String> array;

    ArrayIterator(ArrayList<String> array){
        this.array = array;
    }

    public String next(){
        String get = array.get(i);
        if(hasNext()){
            i++;
        }

        return get;
    }
    public boolean hasNext(){
        boolean next;

        if( i < array.size())
            next = true;
        else
            next = false;
        return next;
    }
}
