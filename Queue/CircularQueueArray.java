package Queue;

public class CircularQueueArray {

    // Circular queue - Remove operation - O(1)
    // We just need to change the updation formula - 
    // -> change front++ to front = (front+1)%size
    // -> change rear++ to rear = (rear+1)%size
    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        // 1 2 3 
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
    
    public static class Queue{
        int arr[];
        int size;
        int rear;
        int front;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1; 
        }

        public boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public boolean isFull(){
            return (rear+1)%size == front;
        }

        public void add(int data){
            if(isFull()){
                System.out.println("Queue is full...");
                return;
            }
            // addign first element;
            if(front == -1){
                front ++;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        public int remove(){
            if(isEmpty()){
                return Integer.MIN_VALUE;
            }
            int ans = arr[front];
            
            // removing last element
            if(rear == front){
                rear = front = -1;
            }else{
                front = (front+1)%size;
            }
            return ans;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("The array is empty");
                return Integer.MIN_VALUE;
            }

            return arr[front];
        }
    }
    
}
