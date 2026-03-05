
// push at bottom using recursion.
package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class PushAtBottom_Recur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         Stack<Integer> st1 = new Stack<>();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            st1.push(arr[i]);
        }
        int ele = sc.nextInt();
        PAB(st1,ele);
        while(st1.size()>0){
            System.out.print(st1.pop()+" ");
        }
        sc.close();
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
