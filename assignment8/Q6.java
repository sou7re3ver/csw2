class Node {
    int value;
    Node left, right;

    Node(int x) {
        value = x;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    boolean isBST(Node node, int min, int max) {
        if (node == null) {
            return true;
        }

        if (node.value < min || node.value > max) {
            return false;
        }

        return isBST(node.left, min, node.value - 1) && isBST(node.right, node.value + 1, max);
    }

    boolean isBST() {
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
