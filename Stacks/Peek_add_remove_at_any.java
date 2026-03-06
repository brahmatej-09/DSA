package Stacks;

import java.util.Scanner;
import java.util.Stack;

//peek add remove at any position
public class Peek_add_remove_at_any {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Stack<Integer> st1 = new Stack<>();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            st1.push(arr[i]);
        }
        int pos1 = sc.nextInt();
        int pos2 = sc.nextInt();
        int ele = sc.nextInt();
        int pos3 = sc.nextInt();
        int p = peek(st1,pos1);
        System.out.println(p);
        add(st1,pos2,ele);
        while(st1.size()>0){
            System.out.print(st1.pop()+" ");
        }
        remove(st1,pos3);
        while(st1.size()>0){
            System.out.print(st1.pop()+" ");
        }
        sc.close();
    }
    private static int peek(Stack<Integer> st,int pos){
        //0 based indexing
        if(pos>st.size()-1 || pos<0 || st.size()==0) return -1;
        Stack<Integer> st1 = new Stack<>();
        while(st.size()-1>pos) {
            st1.push(st.pop());
        }
        int ele = st.peek();
        while(st1.size()>0){
            st.push(st1.pop());
        }
        return ele;
    }
    private static void add(Stack<Integer> st,int pos,int ele){
        // 0 based indexing
        if(pos>st.size() || pos<0 || st.size()==0) return;
        Stack<Integer> st1 = new Stack<>();
        while(st.size()-1>=pos){
            st1.push(st.pop());
        }
        st.push(ele);
        while(st1.size()>0){
            st.push(st1.pop());
        }
        return;
    }
    private static void remove(Stack<Integer> st,int pos){
        // 0 based indexing
        if(pos>st.size()-1 || pos<0 || st.size()==0) return;
        Stack<Integer> st1 = new Stack<>();
        while(st.size()-1>pos){
            st1.push(st.pop());
        }
        st.pop();
        while(st1.size()>0){
            st.push(st1.pop());
        }
        return;
    }
}
