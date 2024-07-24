package Queue;

public class ArrayImplementation {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }

    static class Queue {
        static int arr[];
        static int size;
        static int rear ;
        Queue(int n) {
             arr = new int[n];
             size = n;
             rear = -1;
        }
        // isEmpty
        public boolean isEmpty(){
            return rear==-1;
        }
        // add function
        public void add(int x){
            if(rear == size-1){
                System.out.println("Queue is full");
                return;
            }
            rear ++;
            arr[rear] = x;
            
        }
        // remov function
        public int remove(){
            if(isEmpty()){
                return Integer.MIN_VALUE;
            }
            int ans = arr[0];
            int i;
            for(i=0 ; i<rear ; i++){
                arr[i] = arr[i+1];
            }
            arr[i]=0;
            rear --;
            return ans;
        }

        // peek function
        public int peek(){
            if(isEmpty()){
                return Integer.MIN_VALUE;
            }
            return arr[0];
        }
    }

}
