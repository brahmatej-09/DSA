package Sieve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RangePrimeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int m = sc.nextInt();
        boolean[] seive = new boolean[(int)1e8];
        Arrays.fill(seive,true);
        seive[0] = false;
        seive[1] = false;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i * i < seive.length; i++) {
            if (seive[i]) {
                for (long j = 1L * i * i; j < seive.length; j += i) {
                    seive[(int) j] = false;
                }
            }
        }
        for (int i = 2; i < seive.length; i++) {
            if (seive[i]) {
                list.add(i);
            }
        }
        long sum = 0;
        for(int i=m-1;i<=m+n-1;i++) {
            sum+=list.get(i);
        }
        System.out.println(sum);
    }
}
