import java.util.ArrayList;

public class HeapImpl {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) { // O(logn)
            // add at the last index
            arr.add(data);

            int x = arr.size() - 1; // child index
            while (x > 0) {
                int par = (x - 1) / 2; // parent index
                if (arr.get(par) > arr.get(x)) { // O(logn)
                    // swap
                    int temp = arr.get(x);
                    arr.set(x, arr.get(par));
                    arr.set(par, temp);
                    // move up the tree
                    x=par;
                }else{
                    break;
                }
            }

        }

        public Integer peek() {
            if(arr.isEmpty()){
                return null;
            }
            return arr.get(0);
        }

        public Integer remove(){ // O(logn)
            if(arr.isEmpty()){
                return null;
            }
            int data = arr.get(0);
            // step1- swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1 , temp);

            // step2- delete last
            arr.remove(arr.size()-1);

            // step3 - heapify
            heapify(0);
            return data;
        }

        private void heapify(int i){ // O(logn)
            int left = 2*i + 1;
            int right = 2*i + 2;
            int minIdx =i ;

            if(left < arr.size() && arr.get(left)<arr.get(minIdx)){
                minIdx=left;
            }
            if(right < arr.size() && arr.get(right)<arr.get(minIdx)){
                minIdx=right;
            }
            if(minIdx!=i){
                int temp = arr.get(minIdx);
                arr.set(minIdx, arr.get(i));
                arr.set(i, temp);

                heapify(minIdx);
            }
        }
        private boolean isEmpty(){
            return arr.size()==0;
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
        h.add(9);
        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }
}
