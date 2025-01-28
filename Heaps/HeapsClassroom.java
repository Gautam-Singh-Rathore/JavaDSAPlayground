package Heaps;

import java.util.ArrayList;

public class HeapsClassroom {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        // Add function
        public void add(int data) {
            // add at last index
            arr.add(data);
            int x = arr.size() - 1; // Child index
            int par = (x - 1) / 2;
            while (arr.get(x) < arr.get(par)) { // O(logN)
                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x=par;
                par=(x-1)/2;
            }
        }

        // Peak (Get Mini in Heap)
        public int peek() {
            return arr.get(0);
        }

        // Remove from heap
        public int remove() {
            int data = arr.get(0);
            // step-1 -> swap
            arr.set(0, arr.get(arr.size() - 1));
            arr.removeLast();
            // step-2 -> heapify
            heapify(0);
            // step-3 -> return top value
            return data;
        }

        public void heapify(int root) {
            int leftidx = root * 2 + 1;
            int rightidx = root * 2 + 2;
            // leaf check
            // if (leftidx >= arr.size()) {
            //     return;
            // }
            int smallest = root;

            if (leftidx < arr.size() && arr.get(leftidx) < arr.get(smallest)) {
                smallest = leftidx;
            }

            if (rightidx < arr.size() && arr.get(rightidx) < arr.get(smallest)) {
                smallest = rightidx;
            }

            if (smallest != root) {
                int temp = arr.get(root);
                arr.set(root, arr.get(smallest));
                arr.set(smallest, temp);
                // Recursively heapify the affected subtree
                heapify(smallest);
            }

        }
        public boolean isEmpty(){
            if(arr.size()==0) return true;
            return false;
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
        while (!h.isEmpty()) { // heap sort (O(nlogn))
            System.out.println(h.remove());
        }
    }

}
