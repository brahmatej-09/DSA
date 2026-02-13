package BackTracking;

public class N_Queens {
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                board[i][j] = 'X';

        nQuens(0,board);
    }
    private static void nQuens(int row, char[][] board) {
        int n = board.length;
        if(row==n){ // valid ans
            for(int i=0;i<n;i++) {
                for(int j=0;j<n;j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for(int col=0;col<n;col++){
            if(check(row,col,board)) {
                board[row][col] = 'Q';
                nQuens(row+1,board);
                board[row][col] = 'X'; // backtraking
            }
        }
    }
    private static boolean check(int row, int col, char[][] board) {
        int i=row;
        int n = board.length;
        while(i>=0) {
            if(board[i][col]=='Q') return false;
            i--;
        }
        i = row;
        int j = col;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q') return false;
            i--;
            j--;
        }
        i = row;
        j = col;
        while(i>=0 && j<n){
            if(board[i][j]=='Q') return false;
            i--;
            j++;
        }
        return true;
    }
}
