import java.util.*;
public class FrequencySort {
     static class Pair{
        int val;
        int freq;
        Pair(int val,int freq){
            this.val = val;
            this.freq = freq;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        frequencysort(arr);
    }
    sc.close();
}
public static void frequencysort(int[] arr){
    int n = arr.length;
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<n;i++){
      if(!map.containsKey(arr[i])){
        map.put(arr[i],1);
      }
      else {
        int freq = map.get(arr[i]);
        map.put(arr[i],freq+1);
      }
    }
    Pair[] ans = new Pair[arr.length];
    for(int i=0;i<n;i++){
        ans[i] = new Pair(arr[i],map.get(arr[i]));
    }
    Arrays.sort(ans,(a,b)-> {
        if(a.freq!=b.freq){
            return a.freq-b.freq;
        }
        return a.val-b.val;
    });

    for(Pair x:ans){
        System.out.print(x.val+" ");
    }
    System.out.println();
    }
    
}
