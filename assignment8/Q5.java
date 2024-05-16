class BSTNode {
    int info;
    BSTNode left, right;

    // Constructor
    BSTNode(int x) {
        info = x;
        left = null;
        right = null;
    }

    // Method to insert a node into a binary search tree
    void insert(int value) {
        if (value <= info) {
            if (left == null) {
                left = new BSTNode(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new BSTNode(value);
            } else {
                right.insert(value);
            }
        }
    }
}

class BST {
    BSTNode root;

    // Constructor
    BST() {
        root = null;
    }

    // Method to create a binary search tree from a sorted array
    void createTree(int[] arr, int start, int end) {
        if (start > end) {
            return;
        }

        int mid = start + (end - start) / 2;
        root = new BSTNode(arr[mid]);

        createTree(arr, start, mid - 1);
        createTree(arr, mid + 1, end);
    }

    // Method to insert a node into the binary search tree
    void insert(int value) {
        if (root == null) {
            root = new BSTNode(value);
        } else {
            root.insert(value);
        }
    }
}

public class Q5 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        BST bst = new BST();
        bst.createTree(arr, 0, arr.length - 1);

        // Insert a new node into the binary search tree
        bst.insert(75);

        // Traverse the tree in pre-order
        System.out.println("Pre-order traversal:");
        bst.root.preOrder();
    }
}
