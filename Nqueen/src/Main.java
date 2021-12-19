public class Main {

    public static void main(String[] args) {
        int [][] board = {{0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0}
        };
        int n = board.length;
        long startTime = System.nanoTime();

        if(savethequeens(board,0,n)){
            for (int i= 0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print("" +board[i][j]+ "");
                }
                System.out.println();
            }
        }else {
            System.out.println("no solution");
        }

        long endTime = System.nanoTime();
        System.out.println("NQueen took : " + (endTime - startTime)/1000000 + " milliseconds");
    }

    private static boolean savethequeens(int[][] board, int col, int n) {
        if(col>=n)
            return true;
        
        for(int row = 0; row<n; row++){
            if(isSafe(board,row,col,n)){
                board[row][col] = 1;
                if(savethequeens(board,col+1,n)){
                    return true;
                }
                //backtrack move
                board[row][col]=0;
            }
        }
        return false;
    }
    private static boolean isSafe(int[][] board,int row,int col,int n){
        int i ,j;
        for( i = 0; i<col; i++){
            if(board[row][i] ==1)
                return false;
        }
        for( i =row,j=col; i>=0 && j>=0;i--,j--){
            if(board[i][j]==1)
                return false;
        }
        for( i =row,j=col; i<n && j>=0 ; i++,j--){
            if(board[i][j]==1)
                return false;
        }
        return true;
    }
}
