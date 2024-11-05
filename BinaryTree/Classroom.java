public class Classroom {
    static class Node{
        int data;
        Node left ; 
        Node right ;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }
    // Sum of nodes 
    public static int sum(Node root){
        if(root == null){
            return 0;
        }

        return root.data + sum(root.left) + sum(root.right);
    }
    // Count of nodes in a binary tree
    public static int count(Node root){
        if(root == null ){
            return 0;
        }

        return 1+count(root.left)+count(root.right);
    }
    // Height of a binary tree
    public static int height(Node root){
        if(root == null){
            return 0;
        }
         return 1+Math.max(height(root.left), height(root.right));
    }
    public static void main(String[] args) {
        Node root = new Node(1); 
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

       // System.out.println(height(root));
        //System.out.println(count(root));
        System.out.println(sum(root));
    }
}
