

class BST {
    

    void levelOrder(BNode root) {
        if (root == null) {
            return;
        }

        Queue<BNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BNode node = queue.poll();
            System.out.print(node.info.name + " (" + node.info.population + ") ");

            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    BNode findMax(BNode root) {
        if (root == null) {
            return null;
        }

        BNode max = root;

        while (max.right != null) {
            max = max.right;
        }

        return max;
    }

    BNode findMin(BNode root) {
        if (root == null) {
            return null;
        }

        BNode min = root;

        while (min.left != null) {
            min = min.left;
        }

        return min;
    }

    public static void main(String[] args) {
        BST bst = new BST();

        Country india = new Country("India", 1380000000);
        Country china = new Country("China", 1430000000);
        Country usa = new Country("USA", 331000000);
        Country brazil = new Country("Brazil", 213000000);

        bst.root = bst.insert(bst.root, india);
        bst.root = bst.insert(bst.root, china);
        bst.root = bst.insert(bst.root, usa);
        bst.root = bst.insert(bst.root, brazil);

        System.out.println("Level order traversal: ");
        bst.levelOrder(bst.root);

        System.out.println("\nMaximum population: " + bst.findMax(bst.root).info.name + " (" + bst.findMax(bst.root).info.population + ")");
        System.out.println("Minimum population: " + bst.findMin(bst.root).info.name + " (" + bst.findMin(bst.root).info.population + ")");
    }
}