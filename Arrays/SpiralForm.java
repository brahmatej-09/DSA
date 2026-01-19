import java.util.*;
public class SpiralForm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int minr = 0, maxr = n-1, minc = 0, maxc = m-1;
        while(minr<=maxr && minc<=maxc){
            for(int j=minc;j<=maxc;j++){
                System.out.print(arr[minr][j]+" ");
            }
            System.out.println();
            minr++;
            if(minr>maxr || minc>maxc) break;
            for(int i=minr;i<=maxr;i++){
                System.out.print(arr[i][maxc]+" ");
            }
            System.out.println();
            maxc--;
            if(minr>maxr || minc>maxc) break;
            for(int j=maxc;j>=minc;j--){
                System.out.print(arr[maxr][j]+" ");
            }
            System.out.println();
            maxr--;
            for(int i=maxr;i>=minr;i--){
                System.out.print(arr[i][minc]+" ");
            }
            System.out.println();
            minc++;
        }
        sc.close();
    }
}
