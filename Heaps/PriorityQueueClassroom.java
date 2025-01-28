package Heaps;
import java.util.Comparator;
import java.util.PriorityQueue;


public class PriorityQueueClassroom {
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name , int rank){
            this.name = name;
            this.rank= rank;
        }
        @Override
        public int compareTo(Student s2) {
            return this.rank-s2.rank;
        }
    }
    public static void main(String[] args){
       /*  PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        // add - O(logN)
        // peek - O(1)
        // remove - O(logN)
        pq.add(3); 
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()){
            System.out.println(pq.remove());
        }*/
        
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("gautam", 10));
        pq.add(new Student("dev", 100));
        pq.add(new Student("gunjan", 1));
        pq.add(new Student("anil", 50));
        pq.add(new Student("ummed", 40));

        while(!pq.isEmpty()){
            Student temp = pq.remove();
            System.out.println(temp.name + "->" + temp.rank);
        }
    }
    
}
