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
        // int pos2 = sc.nextInt();
        // int pos3 = sc.nextInt();
        int p = peek(st1,pos1);
        // add(st1,pos2);
        // remove(st1,pos3);
        System.out.println(p);
    }
    private static int peek(Stack<Integer> st,int pos){
        if(pos>st.size() || pos<0 || st.size()==0) return -1;
        Stack<Integer> st1 = new Stack<>();
        while(st.size()>pos-1) {
            st1.push(st.pop());
        }
        int ele = st.peek();
        while(st1.size()>0){
            st.push(st1.pop());
        }
        return ele;
    }
    // private static void add(Stack<Integer> st,int pos){

    // }
    // private static void remove(Stack<Integer> st,int pos){

    // }
}
