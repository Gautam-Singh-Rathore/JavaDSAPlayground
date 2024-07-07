package JavaDSAPlayground.LinkedList_1;

public class Problem4 {
    public static void main(String[] args) {
        // Problem 4 : Find and remove Nth node from the end
        // Iterative Approach  
        // Time Complexity : O(N)
        LinkedList ll = new LinkedList();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        removeNthFromEnd(5);
        ll.print();

    }
    public static int calculateLength(){
        if(LinkedList.head == null){
            return 0;
        }
        int count = 0 ;
        LinkedList.Node temp = LinkedList.head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static int  removeNthFromEnd(int n){
        int size = calculateLength();
        // Check if the node to be removed is the head
        if (n == size) {
            int data = LinkedList.head.data;
            LinkedList.head = LinkedList.head.next;
            return data;
        }
        LinkedList.Node temp = LinkedList.head;
        for(int i=1 ; i<=size-n-1 ; i++){
            temp = temp.next;
        }
         // Now temp is at the (size-n)th node, we need to remove temp.next
        int data = temp.next.data;
         temp.next = temp.next.next;
        
        return data;

    }
}
