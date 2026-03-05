package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Traversing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         Stack<Integer> st1 = new Stack<>();
         Stack<Integer> st2 = new Stack<>();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            st1.push(arr[i]);
        }
        traversal(st1,st2);
        System.out.println();
        print(st1);
        sc.close();
    }
    private static void traversal(Stack<Integer> st1,Stack<Integer> st2) {
        while(st1.size()>0){
            System.out.print(st1.peek()+" ");
            st2.push(st1.pop());
        }
        while(st2.size()>0){
            st1.push(st2.pop());
        }
    }
     private static void print(Stack<Integer> st1) {
        while(st1.size()>0){
            System.out.print(st1.pop()+" ");
        }
    }
}
