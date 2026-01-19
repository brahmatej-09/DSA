package Subsequences;

import java.util.HashSet;
import java.util.Scanner;

public class Maximum_Contiguous_Subsequence {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
        int n = sc.nextInt(); 
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int len = check(arr,n);
        System.out.println(len);
    }
    sc.close();
    }
    public static int check(int[] arr,int n){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        int len = 1;
        int max = 1;
        for(int i=0;i<n;i++){
            int cur = arr[i];
            if(!set.contains(cur-1)) {
            int next = cur+1;
            while(set.contains(next)) {
                len++;
                max = Math.max(max,len);
                next++;
            }
            }
            len = 1;
        }
        return max;
    }
}
// Example
// Input
// 3
// 8
// 21 -22 -22 5 -31 -24 5 -23
// 10
// 18 -33 31 33 30 -14 32 30 16 17
// 6
// 6 3 8 5 2 5

// Output
// 3
// 4
// 2

// Explanation

// Test Case-1:
// Subsequence is: -22, -24, -23.

// Test Case-2: 
// Subsequence is: 31, 33, 30, 32.

// Test Case-3: 
// Subsequence is: 6, 5 or 3, 2.
