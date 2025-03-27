import java.util.ArrayList;
import java.util.Arrays;


class Node {
    int value;
    Node left, right;

    Node(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("The tree cannot contain values smaller than 0");
        }
        this.value = value;
        left = null;
        right = null;
    }
}
interface TreeSerializer {
    // serialize will take the root of a binary tree and serialize it into an int[]
    public int[] serialize(Node root);
}
class MyTreeSerializer implements TreeSerializer {
    @Override
    public int[] serialize(Node root) {

        //I created an arrayList to store the serilialized tree values
        ArrayList<Integer> serializedList = new ArrayList<>();

        //The function I created  for perfoming the actual  recursion + for maintaining the code easier + cleaner view
        serializeHelper(root, serializedList);

        //Converting the the an int array
        int result[] = new int[serializedList.size()];
        int index = 0;
        for(Integer value : serializedList){
            //Copy the value of the list to the array
            result[index++] = value;
        }
        return result;
    }

    public void serializeHelper(Node node, ArrayList<Integer> list){

        //Checking if we have a null node,if we have null node  I will add the value -1 to the tree
        if(node == null){
            list.add(-1);
            return;
        }
        //if we dont  have a null value,I will add  the value to our tree
        //U didnt said how to aproach the tree so I choosed the preorder traversal of a tree which is Root -> Left - Right So first I added the root
        list.add(node.value);
        //Then base of the rule, I used recusirvity process for the left and right subtree
        serializeHelper(node.left, list);
        serializeHelper(node.right,list);
    }
}
class Main {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.right = new Node(3);
        root.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        TreeSerializer serializer = new MyTreeSerializer();
        int[] serializedBTree = serializer.serialize(root);
        System.out.println(Arrays.toString(serializedBTree));
    }
}