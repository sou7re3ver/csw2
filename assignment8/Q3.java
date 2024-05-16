class Country {
    String name;
    int population;

    // Constructor
    Country(String n, int p) {
        name = n;
        population = p;
    }

    // Method to get the name of the country
    String getName() {
        return name;
    }

    // Method to get the population of the country
    int getPopulation() {
        return population;
    }
}

class BNode {
    Country info;
    BNode left, right;

    // Constructor
    BNode(Country c) {
        info = c;
        left = null;
        right = null;
    }

    // Method to insert a node into a binary search tree
    void insert(Country c) {
        if (c.getPopulation() <= info.getPopulation()) {
            if (left == null) {
                left = new BNode(c);
            } else {
                left.insert(c);
            }
        } else {
            if (right == null) {
                right = new BNode(c);
            } else {
                right.insert(c);
            }
        }
    }
}

class BST {
    BNode root;

    // Constructor
    BST() {
        root = null;
    }

    // Method to insert a node into the binary search tree
    void insert(Country c) {
        if (root == null) {
            root = new BNode(c);
        } else {
            root.insert(c);
        }
    }
}
