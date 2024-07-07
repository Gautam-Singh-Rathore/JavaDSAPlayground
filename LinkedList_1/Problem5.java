package JavaDSAPlayground.LinkedList_1;
import JavaDSAPlayground.LinkedList_1.LinkedList.Node;

public class Problem5 {
    public static boolean isPalindrome(Node head) {
        if(head == null || head.next == null){
            return true;
        }
        // Step -1 : Find mid
        Node mid = findMid(head);
        // Step -2 : Reverse second half
        Node prev = null;
        Node curr = mid;
        Node nxt ;
        while(curr != null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }

        Node right = prev;
        Node left = head;

        // Step -3 : Check left == right
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        
        return true;
    }
    public static Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        // Problem 5 : Check if LL is a Palindrome
        // We will learn Slow Fast Concept
        // We will learn how to reverse half LinkedList
        // Step - 1: Find mid Node (By Slow - fast method ; Slow +1 ; Fast +2)
        // Step - 2: 2nd half reverse
        // Step - 3: Check if 1st half == 2nd half
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        System.out.println(isPalindrome(LinkedList.head));
    }
    
}
