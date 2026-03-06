package Stacks;

import java.util.Scanner;
import java.util.Stack;
// reversing stack using  recursion
public class rev_Stack_recur {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            st.push(arr[i]);
        }
        Stack<Integer> st1 = new Stack<>();
        while(st.size()>0){
            int top = st.pop();
            st1.push(top);
            System.out.print(top+" ");
        }
        while(st1.size()>0){
            st.push(st1.pop());
        }
        System.out.println();
        reverse(st);
        while(st.size()>0) {
            System.out.print(st.pop() + " ");
        }
        sc.close();
    }
    public static void reverse(Stack<Integer> st) {
        if(st.size()<=1) return;
        int top = st.pop();
        reverse(st);
        PAB(st,top);
    }
      private static void PAB(Stack<Integer> st,int ele) {
        if(st.size()==0) {
            st.push(ele);
            return;
        }
        int top = st.pop();
        PAB(st,ele);
        st.push(top);
    }
}
