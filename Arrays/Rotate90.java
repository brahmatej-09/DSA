import java.util.*;
public class Rotate90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] ans = new int[n][n];
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans[i][j] = arr[j][i];
            }
        }
        for(int i=0;i<n;i++){
            int a = 0,b = n-1;
            while(a<b){
                int temp = ans[i][a];
                ans[i][a] = ans[i][b];
                ans[i][b] = temp;
                a++;
                b--;
            }
        }
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print(ans[i][j]+" ");
        }
        System.out.println();
       }
        sc.close();
    }
    
}
