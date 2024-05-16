class BSTNode {
    int info;
    BSTNode left, right;

    BSTNode(int x) {
        info = x;
        left = null;
        right = null;
    }

    void delete(int value) {
        if (info > value) {
            if (left!= null) {
                left.delete(value);
            }
        } else if (info < value) {
            if (right!= null) {
                right.delete(value);
            }
        } else {
            if (left == null) {
                info = right.info;
                right = right.right;
            } else if (right == null) {
                info = left.info;
                left = left.left;
            } else {
                int min = right.findMin();
                info = min;
                right.delete(min);
            }
        }
    }

    int findMin() {
        if (left == null) {
            return info;
        } else {
            return left.findMin();
        }
    }

    public void insert(int value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }
}

class BST {
    BSTNode root;

    void insert(int value) {
        if (root == null) {
            root = new BSTNode(value);
        } else {
            root.insert(value);
        }
    }

    void delete(int value) {
        if (root!= null) {
            root.delete(value);
        }
    }
}

