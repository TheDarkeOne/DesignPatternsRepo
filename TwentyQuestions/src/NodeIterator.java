public class NodeIterator implements Iterator{
    Node node;

    NodeIterator(Node root){
        node = root;

    }

    public Node next(String direct){
        if(hasNext()){
            if(direct == "left"){
                return node.left;
            } else if(direct == "right"){
                return node.right;
            }
        }
        return null;
    }
    public boolean hasNext(){
        if(node.left == null && node.right == null){
            return false;
        } else{
            return true;
        }
    }
}
