package Queus;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Basics {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);q.add(20);q.add(30);q.add(40);q.add(50);
        print(q);
        reverse(q);
        reverse(3,q);
        addidx(4,60,q);
        peek(5,q);
        removeidx(4,q);
    }
    
    private static void print(Queue<Integer> q){
        int n = q.size();
        for(int i=0;i<n;i++){
            System.out.print(q.peek()+" ");
            q.add(q.remove());
        }
        System.out.println();
    }
    private static void reverse(Queue<Integer> q){
        int n = q.size();
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            st.add(q.remove());
        }
        for(int i=0;i<n;i++){
            q.add(st.pop());
        }
        print(q);
    }
    private static void removeidx(int idx,Queue<Integer> q) {
        for(int i=0;i<idx;i++){
            q.add(q.remove());
        }
        q.remove();
        for(int i=0;i<q.size()-idx;i++){
            q.add(q.remove());
        }
        print(q);
    }

    private static void peek(int idx, Queue<Integer> q) {
        int n = q.size();
        for(int i=0;i<idx;i++){
            q.add(q.remove());
        }
        System.out.println(q.peek());
        for(int i=0;i<(n-idx);i++){
            q.add(q.remove());
        }
    }
    private static void addidx(int idx, int val,Queue<Integer> q) {
        int n = q.size();
        for(int i=0;i<idx;i++){
            q.add(q.remove());
        }
        q.add(val);
        for(int i=0;i<n-idx;i++){
            q.add(q.remove());
        }
        print(q);
    }

    private static void reverse(int idx, Queue<Integer> q) {
        int n = q.size();
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<idx;i++){
            st.add(q.remove());
        }
        for(int i=0;i<idx;i++){
            q.add(st.pop());
        }
        int r = n-idx;
        for(int i=0;i<r;i++){
            q.add(q.remove());
        }
        print(q);
    }
}
