package BackTracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        List<List<Integer>> list = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();
            boolean[] vis = new boolean[nums.length];
            helper(nums,list,list2,vis);
            System.out.println(list);
    }
    static void helper(int[] nums,List<List<Integer>> list,List<Integer> list2,boolean[] vis) {
        if(list2.size()==nums.length) {
            List<Integer> al = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                al.add(list2.get(i));
            }
            list.add(al);
            return;
        }
        for(int i=0;i<nums.length;i++) {
            if(!vis[i]) {
                vis[i] = true;
                list2.add(nums[i]);
                helper(nums,list,list2,vis);
                vis[i] = false;
                list2.remove(list2.size()-1);
            }
        }
    }
}
