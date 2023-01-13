package AVLtrees;

import Binarytree.Tree2;

public class AVLTree {
    private static class AVLNode {
        private int value;
        private int height;
        private AVLNode leftChild;
        private AVLNode rightChild;

        public AVLNode (int val) {
            this.value = val;
        }

        @Override
        public String toString() {
            return "Node=" + value;
        }
    }
    private AVLNode root;

    public AVLNode insert(AVLNode node, int val) {
        if (node == null) {
            return new AVLNode(val);
        }

        if (val < node.value)
            node.leftChild =  insert(node.leftChild, val);
        else
            node.rightChild = insert(node.rightChild, val);

        setHeight(node);
        node = balance(node);
        return node;
    }
    private AVLNode balance(AVLNode node) {
        if (isLeftHeavy(node)) {
            if (balanceFactor(node.rightChild) < 0)
//                System.out.println("Left rotate on " + node.leftChild.value);
                node.leftChild = rotateLeft(node.leftChild);

            return rotateRight(node);
        }
        else if (isRightHeavy(node)) {
            if (balanceFactor(node.rightChild) > 0)
                node.rightChild = rotateRight(node.rightChild);
//                System.out.println("Right rotate on " + node.rightChild.value);
            return rotateLeft(node);
        }
        return node;
    }

    private AVLNode rotateLeft(AVLNode node) {
        var newRoot = node.rightChild;
        node.rightChild = newRoot.leftChild;
        newRoot.leftChild = node;

        setHeight(node);
        setHeight(newRoot);

        return newRoot;
    }

    private AVLNode rotateRight(AVLNode node) {
        if (node == null)
            return node;
        var newRoot = node.leftChild;
        node.leftChild = newRoot.rightChild;
        newRoot.rightChild = node;

        setHeight(node);
        setHeight(newRoot);

        return newRoot;
    }
    private void setHeight(AVLNode node) {
        node.height = Math.max(
                height(node.leftChild),
                height(node.rightChild)) + 1;
    }

    private boolean isLeftHeavy(AVLNode node) {
        return balanceFactor(node) > 1;
    }
    private boolean isRightHeavy(AVLNode node) {
        return balanceFactor(node) < -1;
    }

    private int balanceFactor(AVLNode node) {
        return (node == null) ? 0 : height(node.leftChild) - height(node.rightChild);
    }

    private int height(AVLNode node) {
        return  (node == null) ? -1 : node.height;

    }

    public void insert(int val) {
        root = insert(root, val);
    }


}
