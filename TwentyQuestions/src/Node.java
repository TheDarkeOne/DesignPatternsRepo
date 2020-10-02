public class Node {
    String questAns;
    Node left;
    Node right;

    Node() {
        this.questAns = "Nothing";
        right = null;
        left = null;
    }

    Node(String questAns) {
        this.questAns = questAns;
        right = null;
        left = null;
    }

    Node(Node root){
        questAns = root.questAns;
        left = root.left;
        right = root.right;
    }
}
