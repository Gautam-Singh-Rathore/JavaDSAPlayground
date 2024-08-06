package Queue;

public class LLImplementaion {
    
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        // 1 2 3 4 5
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
    }

    static class Node{
        int data ; 
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
       Node head = null;
       Node tail = null;

       // isEmpty
       public boolean isEmpty(){
        return head == null & tail ==null;
       }

       // Add
       public void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        //tail = tail.next;
        tail = newNode;

       }

       // Remove
       public int remove(){
         if(isEmpty()){
            System.out.println("Empty Queue : ");
            return Integer.MIN_VALUE;
         }
         int ans = head.data;
         // removing last element
         if(head == tail){
            tail = head = null;
         }else{
            head = head.next;
         }
        
         return ans;
       }

       // Peek
       public int peek(){
        if(isEmpty()){
            System.out.println("Empty Queue : ");
            return Integer.MIN_VALUE;
         }

         return head.data;
       }
        
    }
}
