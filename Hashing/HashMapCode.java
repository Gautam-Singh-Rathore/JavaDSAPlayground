package Hashing;
import java.util.*;;

class HashMapCode {
    static class HashMap<K,V> { // Generics
        private class Node{
            K key;
            V value;
            public Node(K key , V value){
                this.key=key;
                this.value=value;
            }

        }
        private int n; //n
        private int N;
        private LinkedList<Node> buckets[]; //N = buckets.length

        // @SuppressWarnings("unchecked")
        public HashMap(){
            this.N=4;
            this.buckets = new LinkedList[4];
            for(int i=0 ; i<4 ; i++){
                buckets[i] = new LinkedList<>();
            }
        }
        private int searchInLL(K key , int bi){
            LinkedList<Node> ll = buckets[bi]; 
            int di=0;
            for(Node node : ll){
                if(node.key == key){
                    return di;
                }
                di++;
            }
            return -1;
        }

        private int hashFunction(K key){
            int hc = key.hashCode();
            return Math.abs(hc)%N;
        }
        private void rehash(){
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N*2];
            N=2*N;
            for (int i=0 ; i<buckets.length ; i++){
                buckets[i]=new LinkedList<>();
            }
            // nodes -> add in new bucket
            for(LinkedList<Node> ll : oldBuck){
                for(Node node: ll){
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key , V value){ // O(lambda) -> O(1)
            int bi = hashFunction(key);
            int di = searchInLL(key , bi); // valid , -1
            if(di != -1){ // update value
                Node node = buckets[bi].get(di);
                node.value=value;
            }else{  // add new value
                buckets[bi].add(new Node(key , value));
                n++;
            }
            double lambda = (double)n/N;
            if(lambda > 2.0){ // here 2.0 is the threshold value
                rehash();
            }
        }

        public boolean conatinsKey(K key){ //O(1)
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if(di == -1){
                return false;
            }
            return true;
            
        }
        public V remove(K key){ //O(1)
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if(di != -1){ 
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
            return null;

        }
        public V get(K key){ //O(1)
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if(di != -1){ // update value
                Node node = buckets[bi].get(di);
                return node.value;
            }
            return null;

        }
        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for(int i=0 ; i<buckets.length ; i++){
                LinkedList<Node> ll = buckets[i];
                for(Node node : ll){
                    keys.add(node.key);
                }

            }
            return keys;
        }
        public boolean isEmpty(){
            return n==0;
        }
    }

    public static void main(String[] args) {
        HashMap<String , Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal", 5);

        ArrayList<String> keys = hm.keySet();
        System.out.println(keys);
    }
    
}