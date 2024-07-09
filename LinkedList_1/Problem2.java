package LinkedList_1;

public class Problem2 {
    //**Use this function in Linked List Class**
    public static int helper(LinkedList.Node head , int key){
        // Time Complexity : O(N)
        // Space Complexity : O(N)
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int index = helper(head.next , key);
        if(index==-1){
            return -1;
        }

        return index + 1;
    }
    public static int recSearch(int key ){
        return helper(LinkedList.head,key);
    }
    public static void main(String[] args) {
        // Problem 2 : Search (Recursive)
        // Search for a key in a linkedlist . Return the position where it is found . If not found , return -1 . Use Recursion.
        LinkedList ll = new LinkedList();
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        // ll = [1,2,3,4]
        int ans = recSearch(2);
        if(ans==-1){
            System.out.println("Key not found");
        }else{
            System.out.println("Key present at index: "+ans);
        }
    }
}
