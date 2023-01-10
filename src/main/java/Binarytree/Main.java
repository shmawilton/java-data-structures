package Binarytree;

public class Main {
    public static void main(String[] args) {
        Tree2 tree = new Tree2();

        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(15);
        tree.swapRoot();

        //getting nodes at a given distance from the root node
        var list = tree.getNodesAtDistance(1);
        for (var item : list)
            System.out.println(item);


        Tree2 tree2 = new Tree2();

        tree2.insert(10);
        tree2.insert(20);
        tree2.insert(30);
        tree2.insert(15);

//        tree.traversePreOrder();
//        tree.traverseInOrder();

//        System.out.println(tree.height() );
//        System.out.println(tree.min());
//        System.out.println(tree.equals(tree2));
    }


}
