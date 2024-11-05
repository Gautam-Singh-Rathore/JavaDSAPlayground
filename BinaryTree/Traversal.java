import java.util.LinkedList;
import java.util.Queue;

public class Traversal {
    static class Node {
        int data;
        Node left ; 
        Node right;
        public Node(int data){
            this.data = data;
            this.right = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public  Node buildTree(int []nodes){
            idx ++;
            if(nodes[idx]==-1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public  void inorder(Node root){
            // Base case 
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public  void postorder(Node root){
            // Base case 
            if(root==null){
                return;
            }
            inorder(root.left);
            inorder(root.right);
            System.out.print(root.data + " ");
        }

        // LEVEL ORDER TRAVERSAL
        public void levelOrder(Node root){
            if(root == null){
                return ;
            }
            Queue<Node> q= new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    q.add(null);
                    continue;
                                     
                }
                    System.out.print(currNode.data + " ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                
                
            }
        }
    }
    public static void main(String[] args) {
        // preorder traversal
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        
        //tree.inorder(root);
        //tree.postorder(root);

        tree.levelOrder(root);
    }
    
}
