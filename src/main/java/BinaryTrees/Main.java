package BinaryTrees;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
//        tree.traversePreOrder();

        System.out.println(tree.find(50));
        System.out.println("fgsdfsdfsdfsdfs");
    }
}