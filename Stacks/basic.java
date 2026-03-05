package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            st.push(arr[i]);
        }
        print(st);
    }
    private static void print(Stack<Integer> st) {
        while(st.size()>0){
            System.out.print(st.pop()+" ");
        }
    }
}
