package LinkedList_1;


public class Problem3 {
    //**Use this function in Linked List Class**
    public static void reverse(){
        LinkedList.Node prev = null;
        LinkedList.Node curr =  LinkedList.tail = LinkedList.head ;
        LinkedList.Node next ;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        LinkedList.head = prev;

    }
    public static void main(String[] args) {
        // Problem 3 : Reverse a Linked List
        // Time Complexity : O(N)
        // Classical and important question
        // Iterative Approach
        LinkedList ll = new LinkedList();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        reverse();
        ll.print();
    }
}
