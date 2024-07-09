package LinkedList_1;

public class Problem1 {
    //**Use this function in Linked List Class**
    public static int itrSearch(int key){
        int i = 0 ;
        LinkedList.Node temp = LinkedList.head;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public static void main(String[] args) {
        //Problem 1 : Search (Iterative)
        // Time Complexity : O(N)
        // Search for a key in a LinkedList . Return the position where it is found . If not found , return -1. (Linear search)
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2,3);
        int ans = itrSearch(3);
        if(ans==-1){
            System.out.println("Key not found");
        }else{
            System.out.println("Key present at index: "+ans);
        }


    }
}
