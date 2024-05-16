
class BinaryTree {
    BSTNode root;

    void preOrder(BSTNode node) {
        if (node == null) {
            return;
        }

        System.out.print(node.info + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    void inOrder(BSTNode node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.info + " ");
        inOrder(node.right);
    }

    void postOrder(BSTNode node) {
        if (node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.info + " ");
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new BSTNode(50);
        tree.root = tree.root.insert(tree.root, 30);
        tree.root = tree.root.insert(tree.root, 20);
        tree.root = tree.root.insert(tree.root, 40);
        tree.root = tree.root.insert(tree.root, 70);
        tree.root = tree.root.insert(tree.root, 60);
        tree.root = tree.root.insert(tree.root, 80);

        System.out.println("Pre-order traversal: ");
        tree.preOrder(tree.root);

        System.out.println("\nIn-order traversal: ");
        tree.inOrder(tree.root);

        System.out.println("\nPost-order traversal: ");
        tree.postOrder(tree.root);
    }
}