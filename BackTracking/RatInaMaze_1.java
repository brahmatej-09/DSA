package BackTracking;

import java.util.Scanner;

public class RatInaMaze_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         // all four directions
        int m = 3,n = 3;
        String s = "";
        boolean[][] visited = new boolean[m][n];
        int ans = paths(0,0,m-1,n-1,visited,s);
        System.out.println(ans);
        sc.close();

    }

    private static int paths(int r, int c, int er, int ec,boolean[][] visited, String s) {
        if(r<0 || c<0 || r>er || c>ec || visited[r][c]) return 0;
        if(r==er  && c==ec) {
            System.out.println(s);
            visited[r][c] = false;
            return 1;
        }
        visited[r][c] = true;
        int left = paths(r,c-1,er,ec,visited,s+'L');
        int up = paths(r-1,c,er,ec,visited,s+'U');
        int right = paths(r,c+1,er,ec,visited,s+'R');
        int down = paths(r+1,c,er,ec,visited,s+'D');
        visited[r][c] = false;
        return left+up+right+down;
    }
    
}
