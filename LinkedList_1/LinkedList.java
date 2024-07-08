package JavaDSAPlayground.LinkedList_1;



public class LinkedList {
    //**NODE CLASS
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public int size;//Now we dont have to loop the ll to calculate the size.
    // Now its a constant operation.
    //**METHODS
        // * add first
        // Time Complexity - O(1)
        public void addFirst(int data){
            //step1 = create new node
            Node newNode = new Node(data);
            size++;
            if(head == null){
                head = tail = newNode;
                return;
            }

            //step2 = newNode next = head
            newNode.next = head;
            //step3 = head = newNode
            head = newNode;
        }
        // * add last
        // Time Complexity - O(1)
        public void addLast(int data){
            //step-1 : create new node
            Node newNode = new Node(data);
            size++;
            if(head == null){
                head = tail = newNode;
                return;
            }
            //step -2 :
            tail.next = newNode;
            //step - 3:
            tail = newNode;
        }
        // * print a LinkedList
        // Time Complexity - O(N)
        public void print(){
            if(head == null){
                System.out.println("Linked List is empty");
                return;
            }
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        // * Add in the middle
        // Adding takes O(1) but finding the node takes O(N)
        public void add(int index , int data){
            if(index==0){
                addFirst(data);
                return;
            }
            Node newNode = new Node(data);
            size++;
            Node temp = head;
            int i=0;
            while(i<index-1){
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        // * Remove First in a LinkedList
        // (Garbage collector automatically delets the removed node)
        public int removeFirst(){
            if(size==0){
                System.out.println("LinkedList is empty");
                return Integer.MIN_VALUE;
            }else if(size==1){
                int value = head.data;
                head=tail=null;
                size = 0;
                return value;
            }
            int value = head.data;
            head = head.next;
            size--;
            return value;
        }
        // * Remove Last in a LinkedList
        public int removeLast(){
            if(size == 0 ){
                System.out.println("LinkedList is empty");
                return Integer.MIN_VALUE;
            }else if(size==1){
                int value = head.data;
                head=tail=null;
                size=0;
                return value;
            }
            // prev : i = size - 2
            Node prev = head;
            for(int i=0 ; i<size-2 ; i++){
                prev = prev.next;
            }
            int value = prev.next.data; //tail.data
            prev.next = null;
            tail = prev;
            size --;
            return value;

        }
    // **MAIN METHOD
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2,3);
        ll.print();
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        System.out.println(ll.size);
    }
}
