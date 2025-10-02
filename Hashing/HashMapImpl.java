package Hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapImpl {
    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;

            public Node(K key , V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n ;
        private int N;
        private LinkedList<Node> buckets[];  // N

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N=4;
            this.buckets = new LinkedList[4];
            for(int i=0 ; i<4 ; i++){
                buckets[i] = new LinkedList<>();
            }
        }

        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> old[] = buckets;
            buckets = new LinkedList[N*2];
            N = 2*N;
            for(int i=0 ; i<N ; i++){
                buckets[i] = new LinkedList<Node>();
            }

            for(LinkedList<Node> list : old ){
                for(int i=0 ; i<list.size() ; i++){
                    Node node = list.remove();
                    put(node.key, node.value);
                }
            }
        }

        private int hashFunction(K key){
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int searchInLL(K key , int bi){
            LinkedList<Node> list = buckets[bi];
            for(int i=0 ; i<list.size() ; i++){
                Node node = list.get(i);
                if(node.key == key){
                    return i;
                }
            }
            return -1;
        }

        public void put(K key , V value){  // O(lambda) --> O(1)
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if(di != -1){
                buckets[bi].get(di).value=value;
            }else{
                buckets[bi].add(new Node(key, value));
                n++;
            }
            double lambda = n/N;
            if(lambda > 2.0){
                rehash();
            }
        }

        public boolean containsKey(K key){  // O(lambda) --> O(1)
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if(di ==-1) return false;
            return true;
        }

        public V remove(K key){  // O(lambda) --> O(1)
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if(di == -1){
                return null;
            }else{
                V value= buckets[bi].remove(di).value;
                n--;
                return value;
            }
        }

        public V get(K key){  // O(lambda) --> O(1)
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if(di == -1){
                return null;
            }else{
                return buckets[bi].get(di).value;
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for(LinkedList<Node> list : buckets){
                for (Node node : list) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n==0;
        }

        public int size(){
            return n;
        }
    }
    
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 1000);
        hm.put("US", 10000);
        hm.put("UK", 100000);
        hm.put("Sweden", 1000000);

        ArrayList<String> keys = hm.keySet();
        for(String key : keys){
            System.out.println(key +" -> "+hm.get(key));
        }
    }
}
