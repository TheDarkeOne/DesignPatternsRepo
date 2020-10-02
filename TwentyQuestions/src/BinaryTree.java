import java.util.ArrayList;
import java.util.Scanner;

public class BinaryTree {
    Scanner in = new Scanner(System.in);
    Node root = new Node();
    Node temproot;
    Node tempRoot = new Node();
    Node left = new Node();
    Node right = new Node();
    ArrayList<String> array = new ArrayList<>();
    SQLiteTesting stuff = new SQLiteTesting();

    boolean no = false, yes = false;

    BinaryTree(){
        root.questAns = "Is it an animal? ";
        left.questAns = "Rock";
        right.questAns = "Dog";

        temproot = new Node(root);

        root.left = this.left;
        root.right = this.right;
    }

    public void choiceGame(){

        String answer;
        boolean cont = true;

        do{
            temproot = this.root;

            play(this.temproot);



            System.out.println("Do you want to play again? ");
            answer = in.next();


            switch (answer.toLowerCase()){
                case "no": cont = false;
                break;
                case "yes": cont = true;
                break;
            }

        }while(cont == true);

        System.out.println("goodbye");

        store();

    }

    public void play(Node root){
        Iterator iterator = createIterator(root);
        String answer = null;
        if(!iterator.hasNext()){
            System.out.println("It is a " + root.questAns);
            win();
        }else{
            System.out.println(root.questAns);
            answer = in.next();
            root = traverse(answer, iterator, root);
            play(root);
        }

    }

    public Node traverse(String answer, Iterator iterator, Node root){

        switch (answer.toLowerCase()){
            case "no": no = true;
                yes = false;
                tempRoot = root;
                root = iterator.next("left");
                break;
            case "yes": yes = true;
                no = false;
                tempRoot = root;
                root = iterator.next("right");
                break;
        }

        return root;
    }

    public void win(){
        String answer, question = "", answer2;
        Node newNode = new Node();
        System.out.println("Did i win? ");
        answer = in.next();

        switch(answer.toLowerCase()){
            case "yes": System.out.println("Cool");
            break;
            case "no":
                System.out.println("Dang it!");
                in.nextLine();
                System.out.println("Tell me a question that would differentiate your thing from what i guessed? ");
                question = in.nextLine();
                newNode.questAns = question;
                System.out.println("Tell me what you where thinking of?");
                answer2 = in.next();
                newNode.right = new Node(answer2);
                if(no == true){
                    newNode.left = tempRoot.left;
                    tempRoot.left = newNode;
                }else if(yes == true){
                    newNode.left= tempRoot.right;
                    tempRoot.right = newNode;
                }
                break;
        }
    }

    public Iterator createIterator(Node root) {
        return new NodeIterator(root);
    }
    public ArrayIterator createArIterator(ArrayList<String> array) {
        return new ArrayIterator(array);
    }

    public void store(){
        String answer;
        String intest;
        int num = 0, parent = 1;
        System.out.println("What do you want to call your database? ");
        answer = in.next();
        answer = answer + ".db";
        stuff.ClassPath = stuff.createNewDatabase(answer);
        ArrayList<String> tempArr = new ArrayList<>();
        ArrayList<String> array = new ArrayList<String>(CreateArray(root));
        ArIterator iterator = createArIterator(array);
        tempArr.add(iterator.next());
        intest = tempArr.get(0);
        stuff.insert(0,intest);
        while(iterator.hasNext()){
            if(num == 2){
                parent++;
                num = 0;
            }
            tempArr.set(0,iterator.next());
            intest = tempArr.get(0);
            stuff.insert(parent,intest);
            num++;
        }

    }

    ArrayList<String> CreateArray (Node root){

        if(root == null)
            return array;

        array.add(root.questAns);

        CreateArray(root.left);
        CreateArray(root.right);

        return array;
    }
}
