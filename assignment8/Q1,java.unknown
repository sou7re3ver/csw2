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