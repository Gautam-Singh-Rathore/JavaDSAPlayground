package BinarySearchTree;

class BST {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i : values) {
            root = insert(root, i);
        }
        inorder(root);

    }

    // Search a BST

    private static void inorder(Node root) {
        if(root == null){
            return ;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        }
        if (root.data < val) {
            root.right = insert(root.right, val);
        }

        return root;
    }
}